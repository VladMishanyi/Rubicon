package com.vk.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.entity.modbus.ModbusMasterTcpModel;
import org.apache.log4j.Logger;
import org.apache.maven.plugin.lifecycle.Execution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KIP-PC99 on 15.06.2018.
 */

public abstract class RootModbusImpl<E extends Number> implements RootModbus<E> {

    private Logger LOGGER = Logger.getLogger(RootModbusImpl.class);

    private boolean error = false;

    public RootModbusImpl(){}

    @Override
    public boolean hasError(){
        return error;
    }

    @Override
    public synchronized List<E> readDataFromModBus(ModbusMaster modbusMaster,
                                      final int adr,
                                      final BatchRead batch,
                                      final boolean enableBatch,
                                      final ModbusLocator ... modbusLocator) {
        error = false;
        List<E> list = new ArrayList<>();
        try {
            if (enableBatch){
                for (int i=0; i < modbusLocator.length; i++){
                    batch.addLocator(i,modbusLocator[i]);
                }
                BatchResults batchResults = modbusMaster.send(batch);
                for (int i=0; i < modbusLocator.length; i++){
                    list.add(i, (E) batchResults.getValue(i));
                }
            }else {
                for (int i=0; i < modbusLocator.length; i++){
                    list.add(i, (E) modbusMaster.getValue(modbusLocator[i]));
                }
            }

        }catch (Exception e){
            error = true;
            setValuesDefault(list, modbusLocator.length);
            String message = e.getMessage();
            LOGGER.error("ModBus Transport problem, slave address №"+ adr+ "--"+message);
            System.out.println("ModBus Transport problem, slave address №"+ adr+ "--"+message);
            try {
                modbusMaster.destroy();
            }catch (Exception ex){
                error = true;
                String mess = ex.getMessage();
                LOGGER.error("ModBus Transport problem, slave address №"+ adr+ "--"+mess);
                System.out.println("ModBus Transport problem, slave address №"+ adr+ "--"+mess);
            }
        }

        //-----------------------------------------------------------------------------
        String form = "---";
        for (int i=0; i < modbusLocator.length; i++){
            form = form + list.get(i) + "---";
        }
        System.out.println("Device №" + adr + "  "+ form);
        //-----------------------------------------------------------------------------
        return list;
    }

    @Override
    public synchronized void writeDataToModBus(ModbusMaster modbusMaster,
                                  final int adr,
                                  final E values,
                                  final ModbusLocator modbusLocator) {
        try {
            error = false;
            modbusMaster.setValue(modbusLocator, values);
        }catch (Exception e){
            error = true;
            String message = e.getMessage();
            LOGGER.error("ModBus Transport problem, slave address №"+ adr+ "--"+message);
            System.out.println("ModBus Transport problem, slave address №"+ adr+ "--"+message);
            try {
                modbusMaster.destroy();
            }catch (Exception ex){
                error = true;
                String mess = ex.getMessage();
                LOGGER.error("ModBus Transport problem, slave address №"+ adr+ "--"+mess);
                System.out.println("ModBus Transport problem, slave address №"+ adr+ "--"+mess);
            }
        }
    }

    abstract void setValuesDefault(List<E> list, int length);
}
