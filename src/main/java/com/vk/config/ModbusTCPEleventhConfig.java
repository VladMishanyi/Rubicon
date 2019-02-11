package com.vk.config;

import com.vk.entity.modbus.ModbusMasterTcpModel;
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

    @Bean(name = "modbusMasterTcpEleventh")
    public ModbusMasterTcpModel modbusMasterTcpEleventh(){
        ModbusMasterTcpModel modbusMasterTcpModel = new ModbusMasterTcpModel(host, port, timeout, retries);
        return modbusMasterTcpModel;
    }
}
