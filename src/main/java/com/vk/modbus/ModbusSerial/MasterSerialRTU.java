package com.vk.modbus.ModbusSerial;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.*;

/**
 * Created by User on 2017-05-15.
 */

public class MasterSerialRTU {
    private static long startTime = 0;
    private static final ModbusMasterSerialModel modbusMasterSerialModel3 =
            new ModbusMasterSerialModel("COM3", 115200, 8, 1, 0, 300, 1);
    private static ModbusMaster modbusMasterSerial3;

    private static final ModbusMasterSerialModel modbusMasterSerialModel4 =
            new ModbusMasterSerialModel("COM4", 9600, 8, 1, 0, 300, 1);
    private static ModbusMaster modbusMasterSerial4;

    private static final ModbusMasterSerialModel modbusMasterSerialModel6 =
            new ModbusMasterSerialModel("COM6", 9600, 8, 1, 0, 300, 1);
    private static ModbusMaster modbusMasterSerial6;

    private static final ModbusMasterSerialModel modbusMasterSerialModel7 =
            new ModbusMasterSerialModel("COM7", 9600, 8, 1, 0, 300, 1);
    private static ModbusMaster modbusMasterSerial7;

    private static final ModbusShort modbusShort = new ModbusShortImpl();
    private static final ModbusInteger modbusInteger = new ModbusIntegerImpl();
    private static final ModbusLong modbusLong = new ModbusLongImpl();
    private static final ModbusFloat modbusFloat = new ModbusFloatImpl();

    private static final ModbusLocator modbusLocator0 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator1 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator2 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 37, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator3 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 70, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator4 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 23, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator5 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 28, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator6 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 33, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator7 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 38, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator8 = new ModbusLocator(24, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
    private static final ModbusLocator modbusLocator9 = new ModbusLocator(40, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
    private static final ModbusLocator modbusLocator10 = new ModbusLocator(72, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
    private static final ModbusLocator modbusLocator11 = new ModbusLocator(64, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
    private static final ModbusLocator modbusLocator12 = new ModbusLocator(48, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
    private static final ModbusLocator modbusLocator13 = new ModbusLocator(1, RegisterRange.HOLDING_REGISTER, 0, DataType.TWO_BYTE_INT_SIGNED);
    private static final ModbusLocator modbusLocator14 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 5, DataType.TWO_BYTE_INT_SIGNED);
    private static final ModbusLocator modbusLocator15 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 128, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator16 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 130, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator17 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 132, DataType.FOUR_BYTE_FLOAT);

    private static void checkInitMaster(){
        try {
            if ( (modbusMasterSerial3 == null) || !(modbusMasterSerial3.isInitialized()) ) {
                modbusMasterSerial3 = modbusMasterSerialModel3.getMaster();
                modbusMasterSerial3.init();
            }
        }
        catch (Exception e){
            String message = e.getMessage();
            System.out.println("ModBus Init problem, COM №"+ modbusMasterSerialModel3.getPort()+ "--"+message);
        }
    }

    public static void main(String[] args) throws Exception {
        while (true){
            startTime = System.currentTimeMillis();
            checkInitMaster();
            BatchRead batchRead = new BatchRead();
            modbusFloat.readDataFromModBus(modbusMasterSerial3, 16 , batchRead, false, modbusLocator0);
            if (modbusFloat.hasError()) modbusMasterSerial3 = null;
            System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println("----------------------------------------------------------------------------------------");
            Thread.sleep(1000);
        }
//
//        new MasterSerialRTUThread1().start();
//        new MasterSerialRTUThread2().start();
    }
}
