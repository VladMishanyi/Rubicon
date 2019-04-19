package com.vk.entity.modbus;

import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.serotonin.modbus4j.ip.IpParameters;
import com.vk.modbus.RootModbusImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 03.01.2019.
 */
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
@ComponentScan(basePackages = "com.vk.config")
public class ModbusMasterTcpModel {
    private String host;
    private int port;
    private int timeout;
    private int retries;
    private ModbusFactory modbusFactory;
    private IpParameters ipParameters;
    private ModbusMaster modbusMaster;
    private Logger LOGGER = Logger.getLogger(ModbusMasterTcpModel.class);

    public ModbusMasterTcpModel(){
        this.modbusFactory = new ModbusFactory();
        this.ipParameters = new IpParameters();
    }

    public ModbusMasterTcpModel(String host,
                                int port,
                                int timeout,
                                int retries){
        this.modbusFactory = new ModbusFactory();
        this.ipParameters = new IpParameters();
        this.host = host;
        this.port = port;
        this.timeout = timeout;
        this.retries = retries;
    }

    public ModbusMaster getMaster() throws ModbusInitException{
        ipParameters.setHost(host);
        ipParameters.setPort(port);

        modbusMaster = modbusFactory.createTcpMaster(ipParameters, true);
        modbusMaster.setTimeout(timeout);
        modbusMaster.setRetries(retries);

//        modbusMaster.init();

        return modbusMaster;
    }

    public void modbusMasterDestroy(){
        if (modbusMaster != null) modbusMaster.destroy();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public ModbusFactory getModbusFactory() {
        return modbusFactory;
    }

    public void setModbusFactory(ModbusFactory modbusFactory) {
        this.modbusFactory = modbusFactory;
    }

    public IpParameters getIpParameters() {
        return ipParameters;
    }

    public void setIpParameters(IpParameters ipParameters) {
        this.ipParameters = ipParameters;
    }

    public ModbusMaster getModbusMaster() {
        return modbusMaster;
    }

    public void setModbusMaster(ModbusMaster modbusMaster) {
        this.modbusMaster = modbusMaster;
    }
}
