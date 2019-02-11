package com.vk.repository.modbus;

/**
 * Created by KIP-PC99 on 11.01.2019.
 */
public interface IModbusRepositoryLeftWinderPLC110 {

    public void writeDataToRegister0(final float value);
    public void readDataFromRegister0(final boolean enableBatch);
    public void writeDataToRegister1(final float value);
    public void readDataFromRegister1(final boolean enableBatch);
    public void writeDataToRegister2(final float value);
    public void readDataFromRegister2(final boolean enableBatch);
    public void writeDataToRegister3(final float value);
    public void readDataFromRegister3(final boolean enableBatch);
    public void writeDataToRegister4(final int value);
    public void readDataFromRegister4(final boolean enableBatch);
    public void writeDataToRegister5(final int value);
    public void readDataFromRegister5(final boolean enableBatch);
}
