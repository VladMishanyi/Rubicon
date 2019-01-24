package com.vk.chain;

import com.vk.entity.device.DeviceModelRightWindingPLC110;
import com.vk.entity.json.JsonBodyFloat;
import com.vk.entity.json.JsonBodyInt;
import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.service.IModbusServiceRightWinderPLC110;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by KIP-PC99 on 04.12.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service"})
public class Chain1 extends Thread{

    private final Logger LOGGER = Logger.getLogger(Chain1.class);

    public static Queue<ModbusBodyQuery> modbusBodyQueryQueue = new LinkedList<>();

    private final IModbusServiceRightWinderPLC110 iModbusServiceRightWinderPLC110;

    private MessageSendingOperations<String> messageSendingOperations;

    @Autowired
    public Chain1(final IModbusServiceRightWinderPLC110 iModbusServiceRightWinderPLC110,
                  final MessageSendingOperations<String> messageSendingOperations){
        this.iModbusServiceRightWinderPLC110 = iModbusServiceRightWinderPLC110;
        this.messageSendingOperations = messageSendingOperations;
        this.start();
    }


    @Override
    public void run() {
        while (!this.isInterrupted()){
            iModbusServiceRightWinderPLC110.readDataFromRegister0();
            messageSendingOperations.convertAndSend("/topic/subscribe-winder-right-set-length", new JsonBodyFloat(DeviceModelRightWindingPLC110.getDeviceValuesRegister0()));

            iModbusServiceRightWinderPLC110.readDataFromRegister1();
            messageSendingOperations.convertAndSend("/topic/subscribe-winder-right-current-length", new JsonBodyFloat(DeviceModelRightWindingPLC110.getDeviceValuesRegister1()));

            iModbusServiceRightWinderPLC110.readDataFromRegister2();
            messageSendingOperations.convertAndSend("/topic/subscribe-winder-right-all-length", new JsonBodyFloat(DeviceModelRightWindingPLC110.getDeviceValuesRegister2()));

            iModbusServiceRightWinderPLC110.readDataFromRegister3();
            messageSendingOperations.convertAndSend("/topic/subscribe-winder-right-speed-read", new JsonBodyFloat(DeviceModelRightWindingPLC110.getDeviceValuesRegister3()));

            iModbusServiceRightWinderPLC110.readDataFromRegister4();
            messageSendingOperations.convertAndSend("/topic/subscribe-winder-right-bobbin", new JsonBodyInt(DeviceModelRightWindingPLC110.getDeviceValuesRegister4()));

            iModbusServiceRightWinderPLC110.readDataFromRegister5();
            checkQueryQueue();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                LOGGER.error("Interrupted loop thread for right winder --"+e.getMessage());
                System.out.println("Interrupted loop thread for right winder --"+e.getMessage());
            }
        }
    }

    public void checkQueryQueue(){
        if (modbusBodyQueryQueue.size() > 0){
            while (!modbusBodyQueryQueue.isEmpty()){
                ModbusBodyQuery body = modbusBodyQueryQueue.poll();
                switch (body.getQueryNumber()){
                    case 0 : iModbusServiceRightWinderPLC110.writeDataToRegister0(body.getValueFloat()); break;
                    case 1 : iModbusServiceRightWinderPLC110.writeDataToRegister1(body.getValueFloat()); break;
                    case 2 : iModbusServiceRightWinderPLC110.writeDataToRegister2(body.getValueFloat()); break;
                    case 3 : iModbusServiceRightWinderPLC110.writeDataToRegister3(body.getValueFloat()); break;
                    case 4 : iModbusServiceRightWinderPLC110.writeDataToRegister4(body.getValueInt()); break;
                    case 5 : iModbusServiceRightWinderPLC110.writeDataToRegister5(body.getValueInt()); break;
                    default: {
                        LOGGER.error("Wrong command in Chain1 --"+body.getQueryNumber());
                        System.out.println("Wrong command in Chain1 --"+body.getQueryNumber());
                        break;
                    }
                }
            }
        }
    }
}
