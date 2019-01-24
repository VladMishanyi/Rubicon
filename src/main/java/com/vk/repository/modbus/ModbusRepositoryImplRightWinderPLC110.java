package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelRightWindingPLC110;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.entity.modbus.ModbusMasterTcpModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusInteger;
import com.vk.modbus.ModbusShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by KIP-PC99 on 11.01.2019.
 */
@Component
@ComponentScan(basePackages = {"com.vk.config", "com.vk.entity", "com.vk.modbus"})
public class ModbusRepositoryImplRightWinderPLC110 implements IModbusRepositoryRightWinderPLC110{

    private final ModbusMasterTcpModel modbusMasterTcpFirst;

    private final BatchRead batchRead;

    private final ModbusInteger modbusInteger;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplRightWinderPLC110(ModbusMasterTcpModel modbusMasterTcpFirst,
                                                 BatchRead batchRead,
                                                 ModbusInteger modbusInteger,
                                                 ModbusFloat modbusFloat) {
        this.modbusMasterTcpFirst = modbusMasterTcpFirst;
        this.batchRead = batchRead;
        this.modbusInteger = modbusInteger;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public void writeDataToRegister0(final float value){
        modbusFloat.writeDataToModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelRightWindingPLC110.getModbusLocator0());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister0(value);
    }

    @Override
    public void readDataFromRegister0(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelRightWindingPLC110.getModbusLocator0());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister0(list.get(0));
    }

    @Override
    public void writeDataToRegister1(final float value){
        modbusFloat.writeDataToModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelRightWindingPLC110.getModbusLocator1());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister1(value);
    }

    @Override
    public void readDataFromRegister1(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelRightWindingPLC110.getModbusLocator1());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister1(list.get(0));
    }

    @Override
    public void writeDataToRegister2(final float value){
        modbusFloat.writeDataToModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelRightWindingPLC110.getModbusLocator2());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister2(value);
    }

    @Override
    public void readDataFromRegister2(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelRightWindingPLC110.getModbusLocator2());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister2(list.get(0));
    }

    @Override
    public void writeDataToRegister3(final float value){
        modbusFloat.writeDataToModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelRightWindingPLC110.getModbusLocator3());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister3(value);
    }

    @Override
    public void readDataFromRegister3(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelRightWindingPLC110.getModbusLocator3());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister3(list.get(0));
    }

    @Override
    public void writeDataToRegister4(final int value){
        modbusInteger.writeDataToModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelRightWindingPLC110.getModbusLocator4());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister4(value);
    }

    @Override
    public void readDataFromRegister4(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelRightWindingPLC110.getModbusLocator4());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister4(list.get(0));
    }

    @Override
    public void writeDataToRegister5(final int value){
        modbusInteger.writeDataToModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelRightWindingPLC110.getModbusLocator5());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister5(value);
    }

    @Override
    public void readDataFromRegister5(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterTcpFirst,
                DeviceModelRightWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelRightWindingPLC110.getModbusLocator5());
        DeviceModelRightWindingPLC110.setDeviceValuesRegister5(list.get(0));
    }
}
