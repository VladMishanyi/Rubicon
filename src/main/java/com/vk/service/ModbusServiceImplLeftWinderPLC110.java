package com.vk.service;

import com.vk.repository.modbus.IModbusRepositoryLeftWinderPLC110;
import com.vk.repository.modbus.IModbusRepositoryLeftWinderPLC110;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 11.01.2019.
 */
@Component
@ComponentScan(basePackages = {"com.vk.repository"})
public class ModbusServiceImplLeftWinderPLC110 implements IModbusServiceLeftWinderPLC110{

    private IModbusRepositoryLeftWinderPLC110 iModbusRepositoryLeftWinderPLC110;

    @Autowired
    public ModbusServiceImplLeftWinderPLC110(IModbusRepositoryLeftWinderPLC110 iModbusRepositoryLeftWinderPLC110) {
        this.iModbusRepositoryLeftWinderPLC110 = iModbusRepositoryLeftWinderPLC110;
    }

    @Override
    public void writeDataToRegister0(final float value){
        iModbusRepositoryLeftWinderPLC110.writeDataToRegister0(value);
    }

    @Override
    public void readDataFromRegister0(){
        iModbusRepositoryLeftWinderPLC110.readDataFromRegister0(false);
    }

    @Override
    public void writeDataToRegister1(final float value){
        iModbusRepositoryLeftWinderPLC110.writeDataToRegister1(value);
    }

    @Override
    public void readDataFromRegister1(){
        iModbusRepositoryLeftWinderPLC110.readDataFromRegister1(false);
    }

    @Override
    public void writeDataToRegister2(final float value){
        iModbusRepositoryLeftWinderPLC110.writeDataToRegister2(value);
    }

    @Override
    public void readDataFromRegister2(){
        iModbusRepositoryLeftWinderPLC110.readDataFromRegister2(false);
    }

    @Override
    public void writeDataToRegister3(final float value){
        iModbusRepositoryLeftWinderPLC110.writeDataToRegister3(value);
    }

    @Override
    public void readDataFromRegister3(){
        iModbusRepositoryLeftWinderPLC110.readDataFromRegister3(false);
    }

    @Override
    public void writeDataToRegister4(final int value){
        iModbusRepositoryLeftWinderPLC110.writeDataToRegister4(value);
    }

    @Override
    public void readDataFromRegister4(){
        iModbusRepositoryLeftWinderPLC110.readDataFromRegister4(false);
    }

    @Override
    public void writeDataToRegister5(final int value){
        iModbusRepositoryLeftWinderPLC110.writeDataToRegister5(value);
    }

    @Override
    public void readDataFromRegister5(){
        iModbusRepositoryLeftWinderPLC110.readDataFromRegister5(false);
    }
}
