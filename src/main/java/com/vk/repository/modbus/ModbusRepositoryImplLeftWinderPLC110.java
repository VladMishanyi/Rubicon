package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelLeftWindingPLC110;
import com.vk.entity.modbus.ModbusMasterTcpModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusInteger;
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

    @Override
    public void writeDataToRegister0(final float value){
        modbusFloat.writeDataToModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelLeftWindingPLC110.getModbusLocator0());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister0(value);
    }

    @Override
    public void readDataFromRegister0(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelLeftWindingPLC110.getModbusLocator0());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister0(list.get(0));
    }

    @Override
    public void writeDataToRegister1(final float value){
        modbusFloat.writeDataToModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelLeftWindingPLC110.getModbusLocator1());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister1(value);
    }

    @Override
    public void readDataFromRegister1(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelLeftWindingPLC110.getModbusLocator1());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister1(list.get(0));
    }

    @Override
    public void writeDataToRegister2(final float value){
        modbusFloat.writeDataToModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelLeftWindingPLC110.getModbusLocator2());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister2(value);
    }

    @Override
    public void readDataFromRegister2(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelLeftWindingPLC110.getModbusLocator2());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister2(list.get(0));
    }

    @Override
    public void writeDataToRegister3(final float value){
        modbusFloat.writeDataToModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelLeftWindingPLC110.getModbusLocator3());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister3(value);
    }

    @Override
    public void readDataFromRegister3(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelLeftWindingPLC110.getModbusLocator3());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister3(list.get(0));
    }

    @Override
    public void writeDataToRegister4(final int value){
        modbusInteger.writeDataToModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelLeftWindingPLC110.getModbusLocator4());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister4(value);
    }

    @Override
    public void readDataFromRegister4(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelLeftWindingPLC110.getModbusLocator4());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister4(list.get(0));
    }

    @Override
    public void writeDataToRegister5(final int value){
        modbusInteger.writeDataToModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                value,
                DeviceModelLeftWindingPLC110.getModbusLocator5());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister5(value);
    }

    @Override
    public void readDataFromRegister5(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterTcpEleventh,
                DeviceModelLeftWindingPLC110.getDeviceAddress(),
                batchRead,
                enableBatch,
                DeviceModelLeftWindingPLC110.getModbusLocator5());
        DeviceModelLeftWindingPLC110.setDeviceValuesRegister5(list.get(0));
    }
}
