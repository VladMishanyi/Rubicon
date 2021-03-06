package com.vk.config;

import com.vk.entity.modbus.ModbusMasterTcpModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * Created by User on 2018-02-12.
 */
@Configuration
@ComponentScan(basePackages = {"com.vk.config"})
@PropertySource("classpath:modbusTcpTenth.properties")
public class ModbusTCPTenthConfig {

    @Value("${modbusTenth.host}")
    private String host;

    @Value("${modbusTenth.port}")
    private int port;

    @Value("${modbusTenth.timeout}")
    private int timeout;

    @Value("${modbusTenth.retries}")
    private int retries;

    private ModbusMasterTcpModel modbusMasterTcpModel;

    @Autowired
    public ModbusTCPTenthConfig(ModbusMasterTcpModel modbusMasterTcpModel){
        this.modbusMasterTcpModel = modbusMasterTcpModel;
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(name = "modbusMasterTcpTenth")
    public ModbusMasterTcpModel modbusMasterTcpTenth(){
        modbusMasterTcpModel.setHost(host);
        modbusMasterTcpModel.setPort(port);
        modbusMasterTcpModel.setTimeout(timeout);
        modbusMasterTcpModel.setRetries(retries);
        return modbusMasterTcpModel;
    }
}
