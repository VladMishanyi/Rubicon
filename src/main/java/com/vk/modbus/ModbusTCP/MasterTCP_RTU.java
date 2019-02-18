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
    public static void main(String[] args) throws Exception{

        long startTime = 0;
        final ModbusMasterTcpModel modbusMasterTcpModel10 =
                new ModbusMasterTcpModel("192.168.0.10", 502, 1000, 1);
        final ModbusMaster modbusMasterTcp10 = modbusMasterTcpModel10.getMaster();

        final ModbusMasterTcpModel modbusMasterTcpModel11 =
                new ModbusMasterTcpModel("192.168.0.11", 502, 1000, 1);
        final ModbusMaster modbusMasterTcp11 = modbusMasterTcpModel11.getMaster();

        final ModbusShort modbusShort = new ModbusShortImpl();
        final ModbusInteger modbusInteger = new ModbusIntegerImpl();
        final ModbusLong modbusLong = new ModbusLongImpl();
        final ModbusFloat modbusFloat = new ModbusFloatImpl();

        final ModbusLocator modbusLocator0 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 21, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator1 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 29, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator2 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 37, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator3 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 70, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator4 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 23, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator5 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 28, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator6 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 33, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator7 = new ModbusLocator(16, RegisterRange.INPUT_REGISTER, 38, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator8 = new ModbusLocator(24, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator9 = new ModbusLocator(40, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator10 = new ModbusLocator(72, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator11 = new ModbusLocator(64, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator12 = new ModbusLocator(48, RegisterRange.HOLDING_REGISTER, 28, DataType.FOUR_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator13 = new ModbusLocator(1, RegisterRange.HOLDING_REGISTER, 0, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator14 = new ModbusLocator(16, RegisterRange.HOLDING_REGISTER, 5, DataType.TWO_BYTE_INT_SIGNED);
        final ModbusLocator modbusLocator15 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 128, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator16 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 130, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator17 = new ModbusLocator(18, RegisterRange.HOLDING_REGISTER, 132, DataType.FOUR_BYTE_FLOAT);
        final ModbusLocator modbusLocator18 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 0, DataType.FOUR_BYTE_FLOAT_SWAPPED);
        final ModbusLocator modbusLocator19 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 2, DataType.FOUR_BYTE_FLOAT_SWAPPED);
        final ModbusLocator modbusLocator20 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 4, DataType.FOUR_BYTE_FLOAT_SWAPPED);
        final ModbusLocator modbusLocator21 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 6, DataType.FOUR_BYTE_FLOAT_SWAPPED);
        final ModbusLocator modbusLocator22 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 8, DataType.TWO_BYTE_INT_UNSIGNED);
        final ModbusLocator modbusLocator23 = new ModbusLocator(5, RegisterRange.HOLDING_REGISTER, 9, DataType.TWO_BYTE_INT_UNSIGNED);

        int i = 0;
        while (true){
            startTime = System.currentTimeMillis();
            BatchRead batchRead = new BatchRead();

            modbusFloat.readDataFromModBus(modbusMasterTcp10, 5 , batchRead, false,
                    modbusLocator18,
                    modbusLocator19,
                    modbusLocator20,
                    modbusLocator21);
            modbusInteger.readDataFromModBus(modbusMasterTcp10, 5 , batchRead, false,
                    modbusLocator22,
                    modbusLocator23);

            modbusFloat.readDataFromModBus(modbusMasterTcp11, 5 , batchRead, false,
                    modbusLocator18,
                    modbusLocator19,
                    modbusLocator20,
                    modbusLocator21);
            modbusInteger.readDataFromModBus(modbusMasterTcp11, 5 , batchRead, false,
                    modbusLocator22,
                    modbusLocator23);

            System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println("----------------------------------------------------------------------------------------");
            Thread.sleep(100);

        }

//        String host1 = "192.168.0.10";
//        String host2 = "192.168.0.11";
//        int port = 502;
//        int timeout = 1000;
//        int retries = 1;
//        ModbusFactory modbusFactory = new ModbusFactory();
//        IpParameters ipParameters1 = new IpParameters();
//        ipParameters1.setHost(host1);
//        ipParameters1.setPort(port);
//        ModbusMaster modbusMaster1 = modbusFactory.createTcpMaster(ipParameters1, true);
//        modbusMaster1.setTimeout(timeout);
//        modbusMaster1.setRetries(retries);
//
//        IpParameters ipParameters2 = new IpParameters();
//        ipParameters2.setHost(host2);
//        ipParameters2.setPort(port);
//        ModbusMaster modbusMaster2 = modbusFactory.createTcpMaster(ipParameters2, true);
//        modbusMaster1.setTimeout(timeout);
//        modbusMaster1.setRetries(retries);
//
//        modbusMaster1.init();
//        modbusMaster2.init();
//        while (true){
//
//            Float x18 = (Float) modbusMaster1.getValue(modbusLocator18);
//            Float x19 = (Float) modbusMaster1.getValue(modbusLocator19);
//            Float x20 = (Float) modbusMaster1.getValue(modbusLocator20);
//            Float x21 = (Float) modbusMaster1.getValue(modbusLocator21);
//            Integer x22 = (Integer) modbusMaster1.getValue(modbusLocator22);
//            Integer x23 = (Integer) modbusMaster1.getValue(modbusLocator23);
//
//            Float x_18 = (Float) modbusMaster2.getValue(modbusLocator18);
//            Float x_19 = (Float) modbusMaster2.getValue(modbusLocator19);
//            Float x_20 = (Float) modbusMaster2.getValue(modbusLocator20);
//            Float x_21 = (Float) modbusMaster2.getValue(modbusLocator21);
//            Integer x_22 = (Integer) modbusMaster2.getValue(modbusLocator22);
//            Integer x_23 = (Integer) modbusMaster2.getValue(modbusLocator23);
////            modbusMaster1.destroy();
////            modbusMaster2.destroy();
//            System.out.println("--"+x18+"--"+x19+"--"+x20+"--"+x21+"--"+x22+"--"+x23+"--");
//            System.out.println("--"+x_18+"--"+x_19+"--"+x_20+"--"+x_21+"--"+x_22+"--"+x_23+"--");
//            System.out.println("--------------------------------------------------------------");
//            Thread.sleep(100);
//        }
    }
}
