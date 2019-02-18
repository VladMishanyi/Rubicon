package com.vk.config;

import com.vk.entity.modbus.ModbusMasterTcpModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by User on 2018-02-12.
 */
@Configuration
@ComponentScan(basePackages = {"com.vk.config"})
@PropertySource("classpath:modbusTcpEleventh.properties")
public class ModbusTCPEleventhConfig {

    @Value("${modbusEleventh.host}")
    private String host;

    @Value("${modbusEleventh.port}")
    private int port;

    @Value("${modbusEleventh.timeout}")
    private int timeout;

    @Value("${modbusEleventh.retries}")
    private int retries;

    private ModbusMasterTcpModel modbusMasterTcpModel;

    @Autowired
    public ModbusTCPEleventhConfig(ModbusMasterTcpModel modbusMasterTcpModel){
        this.modbusMasterTcpModel = modbusMasterTcpModel;
    }

    @Bean(name = "modbusMasterTcpEleventh")
    public ModbusMasterTcpModel modbusMasterTcpEleventh(){
        modbusMasterTcpModel.setHost(host);
        modbusMasterTcpModel.setPort(port);
        modbusMasterTcpModel.setTimeout(timeout);
        modbusMasterTcpModel.setRetries(retries);
        return modbusMasterTcpModel;
    }
}
