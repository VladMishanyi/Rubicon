package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelLeftWindingPLC110;
import com.vk.entity.modbus.ModbusMasterTcpModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusInteger;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 11.01.2019.
 */
@Component
@ComponentScan(basePackages = {"com.vk.config", "com.vk.entity", "com.vk.modbus"})
public class ModbusRepositoryImplLeftWinderPLC110 implements IModbusRepositoryLeftWinderPLC110{

    private final ModbusMasterTcpModel modbusMasterTcpEleventh;

    private final BatchRead batchRead;

    private final ModbusInteger modbusInteger;

    private final ModbusFloat modbusFloat;

    private ModbusMaster modbusMasterTcp;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplLeftWinderPLC110.class);

    @Autowired
    public ModbusRepositoryImplLeftWinderPLC110(ModbusMasterTcpModel modbusMasterTcpEleventh,
                                                BatchRead batchRead,
                                                ModbusInteger modbusInteger,
                                                ModbusFloat modbusFloat) {
        this.modbusMasterTcpEleventh = modbusMasterTcpEleventh;
        this.batchRead = batchRead;
        this.modbusInteger = modbusInteger;
        this.modbusFloat = modbusFloat;
    }

    private void checkInitMaster(){
        if ( (modbusMasterTcp == null) || !(modbusMasterTcp.isInitialized()) ) {
            try {
                modbusMasterTcp = modbusMasterTcpEleventh.getMaster();
                modbusMasterTcp.init();
            }
            catch (Exception e){
                String message = e.getMessage();
                LOGGER.error("ModBus Init problem, slave address №"+ modbusMasterTcpEleventh.getHost()+ "--"+message);
                System.out.println("ModBus Init problem, slave address №"+ modbusMasterTcpEleventh.getHost()+ "--"+message);
            }
        }
    }

    @Override
    public void writeDataToRegister0(final float value){
        checkInitMaster();
        if (modbusMasterTcp != null){
            modbusFloat.writeDataToModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    value,
                    DeviceModelLeftWindingPLC110.getModbusLocator0());
            if (modbusFloat.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister0(value);
        }
    }

    @Override
    public void readDataFromRegister0(final boolean enableBatch){
        checkInitMaster();
        if (modbusMasterTcp != null){
            final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    DeviceModelLeftWindingPLC110.getModbusLocator0());
            if (modbusFloat.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister0(list.get(0));
        }
    }

    @Override
    public void writeDataToRegister1(final float value){
        checkInitMaster();
        if (modbusMasterTcp != null){
            modbusFloat.writeDataToModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    value,
                    DeviceModelLeftWindingPLC110.getModbusLocator1());
            if (modbusFloat.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister1(value);
        }
    }

    @Override
    public void readDataFromRegister1(final boolean enableBatch){
        checkInitMaster();
        if (modbusMasterTcp != null){
            final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    DeviceModelLeftWindingPLC110.getModbusLocator1());
            if (modbusFloat.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister1(list.get(0));
        }
    }

    @Override
    public void writeDataToRegister2(final float value){
        checkInitMaster();
        if (modbusMasterTcp != null){
            modbusFloat.writeDataToModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    value,
                    DeviceModelLeftWindingPLC110.getModbusLocator2());
            if (modbusFloat.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister2(value);
        }
    }

    @Override
    public void readDataFromRegister2(final boolean enableBatch){
        checkInitMaster();
        if (modbusMasterTcp != null){
            final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    DeviceModelLeftWindingPLC110.getModbusLocator2());
            if (modbusFloat.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister2(list.get(0));
        }
    }

    @Override
    public void writeDataToRegister3(final float value){
        checkInitMaster();
        if (modbusMasterTcp != null){
            modbusFloat.writeDataToModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    value,
                    DeviceModelLeftWindingPLC110.getModbusLocator3());
            if (modbusFloat.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister3(value);
        }
    }

    @Override
    public void readDataFromRegister3(final boolean enableBatch){
        checkInitMaster();
        if (modbusMasterTcp != null){
            final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    DeviceModelLeftWindingPLC110.getModbusLocator3());
            if (modbusFloat.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister3(list.get(0));
        }
    }

    @Override
    public void writeDataToRegister4(final int value){
        checkInitMaster();
        if (modbusMasterTcp != null){
            modbusInteger.writeDataToModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    value,
                    DeviceModelLeftWindingPLC110.getModbusLocator4());
            if (modbusInteger.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister4(value);
        }
    }

    @Override
    public void readDataFromRegister4(final boolean enableBatch){
        checkInitMaster();
        if (modbusMasterTcp != null){
            final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    DeviceModelLeftWindingPLC110.getModbusLocator4());
            if (modbusInteger.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister4(list.get(0));
        }
    }

    @Override
    public void writeDataToRegister5(final int value){
        checkInitMaster();
        if (modbusMasterTcp != null){
            modbusInteger.writeDataToModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    value,
                    DeviceModelLeftWindingPLC110.getModbusLocator5());
            if (modbusInteger.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister5(value);
        }
    }

    @Override
    public void readDataFromRegister5(final boolean enableBatch){
        checkInitMaster();
        if (modbusMasterTcp != null){
            final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterTcp,
                    DeviceModelLeftWindingPLC110.getDeviceAddress(),
                    batchRead,
                    enableBatch,
                    DeviceModelLeftWindingPLC110.getModbusLocator5());
            if (modbusInteger.hasError()) modbusMasterTcp = null;
            DeviceModelLeftWindingPLC110.setDeviceValuesRegister5(list.get(0));
        }
    }
}
