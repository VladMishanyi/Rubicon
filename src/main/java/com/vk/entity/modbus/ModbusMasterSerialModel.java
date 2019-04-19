package com.vk.entity.modbus;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.serotonin.modbus4j.ip.IpParameters;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * Created by User on 2018-02-22.
 */
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
@ComponentScan(basePackages = "com.vk.config")
public class ModbusMasterSerialModel {
    private String port;
    private int baduRate;
    private int dataBits;
    private int stopBits;
    private int parity;
    private int timeout;
    private int retries;
    private SerialParameters serialParameters;
    private ModbusFactory modbusFactory;
    private ModbusMaster modbusMaster;
    private Logger LOGGER = Logger.getLogger(ModbusMasterSerialModel.class);

    public ModbusMasterSerialModel(){
        modbusFactory = new ModbusFactory();
        serialParameters = new SerialParameters();
    }

    public ModbusMasterSerialModel(final String port,
                                   final int baduRate,
                                   final int dataBits,
                                   final int stopBits,
                                   final int parity,
                                   final int timeout,
                                   final int retries){
        modbusFactory = new ModbusFactory();
        serialParameters = new SerialParameters();
        this.port = port;
        this.baduRate = baduRate;
        this.dataBits = dataBits;
        this.stopBits = stopBits;
        this.parity = parity;
        this.timeout = timeout;
        this.retries = retries;
    }

    public ModbusMaster getMaster() throws ModbusInitException{
        serialParameters.setCommPortId(port);
        serialParameters.setBaudRate(baduRate);
        serialParameters.setDataBits(dataBits);
        serialParameters.setStopBits(stopBits);
        serialParameters.setParity(parity);

        modbusMaster =  modbusFactory.createRtuMaster(serialParameters);
        modbusMaster.setTimeout(timeout);
        modbusMaster.setRetries(retries);

//        modbusMaster.init();

        return modbusMaster;
    }

    public void modbusMasterDestroy(){
        if (modbusMaster != null) modbusMaster.destroy();
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public int getBaduRate() {
        return baduRate;
    }

    public void setBaduRate(final int baduRate) {
        this.baduRate = baduRate;
    }

    public int getDataBits() {
        return dataBits;
    }

    public void setDataBits(final int dataBits) {
        this.dataBits = dataBits;
    }

    public int getStopBits() {
        return stopBits;
    }

    public void setStopBits(final int stopBits) {
        this.stopBits = stopBits;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(final int parity) {
        this.parity = parity;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(final int timeout) {
        this.timeout = timeout;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(final int retries) {
        this.retries = retries;
    }
}
