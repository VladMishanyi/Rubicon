package com.vk.modbus.ModbusTCP;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.ip.IpParameters;
import com.vk.entity.modbus.ModbusMasterTcpModel;
import com.vk.modbus.*;
import org.springframework.core.env.SystemEnvironmentPropertySource;


/**
 * Created by User on 2017-05-18.
 */
public class MasterTCP_RTU {
    private static long startTime = 0;
    private static final ModbusMasterTcpModel modbusMasterTcpModel10 =
            new ModbusMasterTcpModel("192.168.0.10", 502, 300, 1);
    private static ModbusMaster modbusMasterTcp10;

    private static final ModbusMasterTcpModel modbusMasterTcpModel11 =
            new ModbusMasterTcpModel("192.168.0.11", 502, 300, 1);
    private static ModbusMaster modbusMasterTcp11;

    private static final ModbusShort modbusShort = new ModbusShortImpl();
    private static final ModbusInteger modbusInteger = new ModbusIntegerImpl();
    private static final ModbusLong modbusLong = new ModbusLongImpl();
    private static final ModbusFloat modbusFloat = new ModbusFloatImpl();

    private static final ModbusLocator modbusLocator0 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);
    private static final ModbusLocator modbusLocator1 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);
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
    private static final ModbusLocator modbusLocator18 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 0, DataType.FOUR_BYTE_FLOAT_SWAPPED);
    private static final ModbusLocator modbusLocator19 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT_SWAPPED);
    private static final ModbusLocator modbusLocator20 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_FLOAT_SWAPPED);
    private static final ModbusLocator modbusLocator21 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 6, DataType.FOUR_BYTE_FLOAT_SWAPPED);
    private static final ModbusLocator modbusLocator22 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 8, DataType.TWO_BYTE_INT_UNSIGNED);
    private static final ModbusLocator modbusLocator23 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 9, DataType.TWO_BYTE_INT_UNSIGNED);

    private static void checkInitMaster10(){
        if ( (modbusMasterTcp10 == null) || !(modbusMasterTcp10.isInitialized()) ) {
            try {
                modbusMasterTcp10 = modbusMasterTcpModel10.getMaster();
                modbusMasterTcp10.init();
            }
            catch (Exception e){
                String message = e.getMessage();
                System.out.println("ModBus Init problem, slave address №"+ modbusMasterTcpModel10.getHost()+ "--"+message);
            }
        }
    }

    private static void checkInitMaster11(){
        if ( (modbusMasterTcp11 == null) || !(modbusMasterTcp11.isInitialized()) ) {
            try {
                modbusMasterTcp11 = modbusMasterTcpModel11.getMaster();
                modbusMasterTcp11.init();
            }
            catch (Exception e){
                String message = e.getMessage();
                System.out.println("ModBus Init problem, slave address №"+ modbusMasterTcpModel11.getHost()+ "--"+message);
            }
        }
    }

    public static void main(String[] args) throws Exception{

        while (true){
            startTime = System.currentTimeMillis();
            checkInitMaster10();
            checkInitMaster11();
            BatchRead batchRead = new BatchRead();

            modbusFloat.readDataFromModBus(modbusMasterTcp10, 5 , batchRead, false,
                    modbusLocator18,
                    modbusLocator19,
                    modbusLocator20,
                    modbusLocator21);
            if (modbusFloat.hasError()) modbusMasterTcp10 = null;
            modbusInteger.readDataFromModBus(modbusMasterTcp10, 5 , batchRead, false,
                    modbusLocator22,
                    modbusLocator23);
            if (modbusInteger.hasError()) modbusMasterTcp10 = null;
            modbusFloat.readDataFromModBus(modbusMasterTcp11, 5 , batchRead, false,
                    modbusLocator18,
                    modbusLocator19,
                    modbusLocator20,
                    modbusLocator21);
            if (modbusFloat.hasError()) modbusMasterTcp11 = null;
            modbusInteger.readDataFromModBus(modbusMasterTcp11, 5 , batchRead, false,
                    modbusLocator22,
                    modbusLocator23);
            if (modbusInteger.hasError()) modbusMasterTcp11 = null;
            System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println("----------------------------------------------------------------------------------------");
            Thread.sleep(100);
        }
    }
}
