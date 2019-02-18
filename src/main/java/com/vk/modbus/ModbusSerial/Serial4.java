package com.vk.modbus.ModbusSerial;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloatImpl;

/**
 * Created by KIP-PC99 on 03.12.2018.
 */
public class Serial4 extends Thread {

    public Serial4(){
        this.start();
    }
    @Override
    public void run(){
        while (!this.isInterrupted()){
            final ModbusMasterSerialModel modbusMasterSerialModel4 =
                    new ModbusMasterSerialModel("COM4", 9600, 8, 1, 0, 1000, 1);
            final ModbusMaster modbusMasterSerial4 = modbusMasterSerialModel4.getMaster();
            final ModbusFloatImpl modbusFloat = new ModbusFloatImpl();
            final ModbusLocator modbusLocator17 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 132, DataType.FOUR_BYTE_FLOAT);
            BatchRead batch = new BatchRead();
            modbusFloat.readDataFromModBus(modbusMasterSerial4, 18, batch,false, modbusLocator17);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.getMessage();
            }
        }
    }
}
