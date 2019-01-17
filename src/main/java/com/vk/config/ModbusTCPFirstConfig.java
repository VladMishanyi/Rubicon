package com.vk.config;

import com.vk.entity.modbus.ModbusMasterSerialModel;
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
@PropertySource("classpath:modbusTcpFirst.properties")
public class ModbusTCPFirstConfig {

    @Value("${modbusFirst.host}")
    private String host;

    @Value("${modbusFirst.port}")
    private int port;

    @Value("${modbusFirst.timeout}")
    private int timeout;

    @Value("${modbusFirst.retries}")
    private int retries;

    @Bean(name = "modbusMasterTcpFirst")
    public ModbusMasterTcpModel modbusMasterTcpFirst(){
        ModbusMasterTcpModel modbusMasterTcpModel = new ModbusMasterTcpModel(host, port, timeout, retries);
        return modbusMasterTcpModel;
    }
}
