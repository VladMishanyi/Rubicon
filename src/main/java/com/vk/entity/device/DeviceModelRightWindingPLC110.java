package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;

/**
 * Created by KIP-PC99 on 10.01.2019.
 */
public class DeviceModelRightWindingPLC110 {
    private static final int deviceAddress = 5;

    private static final int deviceRegisterRange0 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset0 = 0;
    private static final int deviceRegisterDataType0 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final float hysteresis0 = 1.0F;
    private static float deviceValuesRegister0 = 0;
    private static float hisDeviceValuesRegisters0 = 0;
    private static final ModbusLocator modbusLocator0 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange0,
                    deviceRegisterOffset0,
                    deviceRegisterDataType0);

    private static final int deviceRegisterRange1 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset1 = 2;
    private static final int deviceRegisterDataType1 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final float hysteresis1 = 1.0F;
    private static float deviceValuesRegister1 = 0;
    private static float hisDeviceValuesRegisters1 = 0;
    private static final ModbusLocator modbusLocator1 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange1,
                    deviceRegisterOffset1,
                    deviceRegisterDataType1);

    private static final int deviceRegisterRange2 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset2 = 4;
    private static final int deviceRegisterDataType2 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final float hysteresis2 = 1.0F;
    private static float deviceValuesRegister2 = 0;
    private static float hisDeviceValuesRegisters2 = 0;
    private static final ModbusLocator modbusLocator2 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange2,
                    deviceRegisterOffset2,
                    deviceRegisterDataType2);

    private static final int deviceRegisterRange3 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset3 = 6;
    private static final int deviceRegisterDataType3 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final float hysteresis3 = 1.0F;
    private static float deviceValuesRegister3 = 0;
    private static float hisDeviceValuesRegisters3 = 0;
    private static final ModbusLocator modbusLocator3 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange3,
                    deviceRegisterOffset3,
                    deviceRegisterDataType3);

    private static final int deviceRegisterRange4 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset4 = 8;
    private static final int deviceRegisterDataType4 = DataType.TWO_BYTE_INT_UNSIGNED;
    private static final int hysteresis4 = 1;
    private static int deviceValuesRegister4 = 0;
    private static int hisDeviceValuesRegisters4 = 0;
    private static final ModbusLocator modbusLocator4 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange4,
                    deviceRegisterOffset4,
                    deviceRegisterDataType4);

    private static final int deviceRegisterRange5 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset5 = 9;
    private static final int deviceRegisterDataType5 = DataType.TWO_BYTE_INT_UNSIGNED;
    private static final int hysteresis5 = 1;
    private static int deviceValuesRegister5 = 0;
    private static int hisDeviceValuesRegisters5 = 0;
    private static final ModbusLocator modbusLocator5 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange5,
                    deviceRegisterOffset5,
                    deviceRegisterDataType5);

    public DeviceModelRightWindingPLC110(){}

    public static int getDeviceAddress() {
        return deviceAddress;
    }

    public static int getDeviceRegisterRange0() {
        return deviceRegisterRange0;
    }

    public static int getDeviceRegisterOffset0() {
        return deviceRegisterOffset0;
    }

    public static int getDeviceRegisterDataType0() {
        return deviceRegisterDataType0;
    }

    public static float getHysteresis0() {
        return hysteresis0;
    }

    public static float getDeviceValuesRegister0() {
        return deviceValuesRegister0;
    }

    public static void setDeviceValuesRegister0(float deviceValuesRegister0) {
        DeviceModelRightWindingPLC110.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public static float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public static void setHisDeviceValuesRegisters0(float hisDeviceValuesRegisters0) {
        DeviceModelRightWindingPLC110.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
    }

    public static ModbusLocator getModbusLocator0() {
        return modbusLocator0;
    }

    public static int getDeviceRegisterRange1() {
        return deviceRegisterRange1;
    }

    public static int getDeviceRegisterOffset1() {
        return deviceRegisterOffset1;
    }

    public static int getDeviceRegisterDataType1() {
        return deviceRegisterDataType1;
    }

    public static float getHysteresis1() {
        return hysteresis1;
    }

    public static float getDeviceValuesRegister1() {
        return deviceValuesRegister1;
    }

    public static void setDeviceValuesRegister1(float deviceValuesRegister1) {
        DeviceModelRightWindingPLC110.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public static float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public static void setHisDeviceValuesRegisters1(float hisDeviceValuesRegisters1) {
        DeviceModelRightWindingPLC110.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
    }

    public static ModbusLocator getModbusLocator1() {
        return modbusLocator1;
    }

    public static int getDeviceRegisterRange2() {
        return deviceRegisterRange2;
    }

    public static int getDeviceRegisterOffset2() {
        return deviceRegisterOffset2;
    }

    public static int getDeviceRegisterDataType2() {
        return deviceRegisterDataType2;
    }

    public static float getHysteresis2() {
        return hysteresis2;
    }

    public static float getDeviceValuesRegister2() {
        return deviceValuesRegister2;
    }

    public static void setDeviceValuesRegister2(float deviceValuesRegister2) {
        DeviceModelRightWindingPLC110.deviceValuesRegister2 = deviceValuesRegister2;
    }

    public static float getHisDeviceValuesRegisters2() {
        return hisDeviceValuesRegisters2;
    }

    public static void setHisDeviceValuesRegisters2(float hisDeviceValuesRegisters2) {
        DeviceModelRightWindingPLC110.hisDeviceValuesRegisters2 = hisDeviceValuesRegisters2;
    }

    public static ModbusLocator getModbusLocator2() {
        return modbusLocator2;
    }

    public static int getDeviceRegisterRange3() {
        return deviceRegisterRange3;
    }

    public static int getDeviceRegisterOffset3() {
        return deviceRegisterOffset3;
    }

    public static int getDeviceRegisterDataType3() {
        return deviceRegisterDataType3;
    }

    public static float getHysteresis3() {
        return hysteresis3;
    }

    public static float getDeviceValuesRegister3() {
        return deviceValuesRegister3;
    }

    public static void setDeviceValuesRegister3(float deviceValuesRegister3) {
        DeviceModelRightWindingPLC110.deviceValuesRegister3 = deviceValuesRegister3;
    }

    public static float getHisDeviceValuesRegisters3() {
        return hisDeviceValuesRegisters3;
    }

    public static void setHisDeviceValuesRegisters3(float hisDeviceValuesRegisters3) {
        DeviceModelRightWindingPLC110.hisDeviceValuesRegisters3 = hisDeviceValuesRegisters3;
    }

    public static ModbusLocator getModbusLocator3() {
        return modbusLocator3;
    }

    public static int getDeviceRegisterRange4() {
        return deviceRegisterRange4;
    }

    public static int getDeviceRegisterOffset4() {
        return deviceRegisterOffset4;
    }

    public static int getDeviceRegisterDataType4() {
        return deviceRegisterDataType4;
    }

    public static int getHysteresis4() {
        return hysteresis4;
    }

    public static int getDeviceValuesRegister4() {
        return deviceValuesRegister4;
    }

    public static void setDeviceValuesRegister4(int deviceValuesRegister4) {
        DeviceModelRightWindingPLC110.deviceValuesRegister4 = deviceValuesRegister4;
    }

    public static int getHisDeviceValuesRegisters4() {
        return hisDeviceValuesRegisters4;
    }

    public static void setHisDeviceValuesRegisters4(int hisDeviceValuesRegisters4) {
        DeviceModelRightWindingPLC110.hisDeviceValuesRegisters4 = hisDeviceValuesRegisters4;
    }

    public static ModbusLocator getModbusLocator4() {
        return modbusLocator4;
    }

    public static int getDeviceRegisterRange5() {
        return deviceRegisterRange5;
    }

    public static int getDeviceRegisterOffset5() {
        return deviceRegisterOffset5;
    }

    public static int getDeviceRegisterDataType5() {
        return deviceRegisterDataType5;
    }

    public static int getHysteresis5() {
        return hysteresis5;
    }

    public static int getDeviceValuesRegister5() {
        return deviceValuesRegister5;
    }

    public static void setDeviceValuesRegister5(int deviceValuesRegister5) {
        DeviceModelRightWindingPLC110.deviceValuesRegister5 = deviceValuesRegister5;
    }

    public static int getHisDeviceValuesRegisters5() {
        return hisDeviceValuesRegisters5;
    }

    public static void setHisDeviceValuesRegisters5(int hisDeviceValuesRegisters5) {
        DeviceModelRightWindingPLC110.hisDeviceValuesRegisters5 = hisDeviceValuesRegisters5;
    }

    public static ModbusLocator getModbusLocator5() {
        return modbusLocator5;
    }

    public boolean hysteresis(){
        boolean inner = HysComparator.compare(getHisDeviceValuesRegisters0(),
                getDeviceValuesRegister0(),
                getHysteresis0());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters1(),
                getDeviceValuesRegister1(),
                getHysteresis1());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters2(),
                getDeviceValuesRegister2(),
                getHysteresis2());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters3(),
                getDeviceValuesRegister3(),
                getHysteresis3());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters4(),
                getDeviceValuesRegister4(),
                getHysteresis4());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters5(),
                getDeviceValuesRegister5(),
                getHysteresis5());
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
            hisDeviceValuesRegisters1 = deviceValuesRegister1;
            hisDeviceValuesRegisters2 = deviceValuesRegister2;
            hisDeviceValuesRegisters3 = deviceValuesRegister3;
            hisDeviceValuesRegisters4 = deviceValuesRegister4;
            hisDeviceValuesRegisters5 = deviceValuesRegister5;
        }
        return inner;
    }
}
