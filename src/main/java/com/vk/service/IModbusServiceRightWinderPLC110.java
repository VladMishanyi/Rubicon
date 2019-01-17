package com.vk.service;

/**
 * Created by KIP-PC99 on 11.01.2019.
 */
public interface IModbusServiceRightWinderPLC110 {

    public void writeDataToRegister0(final int value);
    public void readDataFromRegister0();
    public void writeDataToRegister1(final int value);
    public void readDataFromRegister1();
    public void writeDataToRegister2(final int value);
    public void readDataFromRegister2();
    public void writeDataToRegister3(final int value);
    public void readDataFromRegister3();
    public void writeDataToRegister4(final int value);
    public void readDataFromRegister4();
    public void writeDataToRegister5(final int value);
    public void readDataFromRegister5();
}
