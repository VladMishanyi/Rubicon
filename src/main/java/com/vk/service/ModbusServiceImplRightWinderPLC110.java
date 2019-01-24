package com.vk.service;

import com.vk.repository.modbus.IModbusRepositoryRightWinderPLC110;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by KIP-PC99 on 11.01.2019.
 */
@Component
@ComponentScan(basePackages = {"com.vk.repository"})
public class ModbusServiceImplRightWinderPLC110 implements IModbusServiceRightWinderPLC110{

    private IModbusRepositoryRightWinderPLC110 iModbusRepositoryRightWinderPLC110;

    @Autowired
    public ModbusServiceImplRightWinderPLC110(IModbusRepositoryRightWinderPLC110 iModbusRepositoryRightWinderPLC110) {
        this.iModbusRepositoryRightWinderPLC110 = iModbusRepositoryRightWinderPLC110;
    }

    @Override
    public void writeDataToRegister0(final float value){
        iModbusRepositoryRightWinderPLC110.writeDataToRegister0(value);
    }

    @Override
    public void readDataFromRegister0(){
        iModbusRepositoryRightWinderPLC110.readDataFromRegister0(false);
    }

    @Override
    public void writeDataToRegister1(final float value){
        iModbusRepositoryRightWinderPLC110.writeDataToRegister1(value);
    }

    @Override
    public void readDataFromRegister1(){
        iModbusRepositoryRightWinderPLC110.readDataFromRegister1(false);
    }

    @Override
    public void writeDataToRegister2(final float value){
        iModbusRepositoryRightWinderPLC110.writeDataToRegister2(value);
    }

    @Override
    public void readDataFromRegister2(){
        iModbusRepositoryRightWinderPLC110.readDataFromRegister2(false);
    }

    @Override
    public void writeDataToRegister3(final float value){
        iModbusRepositoryRightWinderPLC110.writeDataToRegister3(value);
    }

    @Override
    public void readDataFromRegister3(){
        iModbusRepositoryRightWinderPLC110.readDataFromRegister3(false);
    }

    @Override
    public void writeDataToRegister4(final int value){
        iModbusRepositoryRightWinderPLC110.writeDataToRegister4(value);
    }

    @Override
    public void readDataFromRegister4(){
        iModbusRepositoryRightWinderPLC110.readDataFromRegister4(false);
    }

    @Override
    public void writeDataToRegister5(final int value){
        iModbusRepositoryRightWinderPLC110.writeDataToRegister5(value);
    }

    @Override
    public void readDataFromRegister5(){
        iModbusRepositoryRightWinderPLC110.readDataFromRegister5(false);
    }
}
