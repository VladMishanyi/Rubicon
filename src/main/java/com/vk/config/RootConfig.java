package com.vk.config;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ip.IpParameters;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 2017-07-19.
 */
@Configuration
@ComponentScan(basePackages = "com.vk")
public class RootConfig {

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public BatchRead batchRead(){
        return new BatchRead();
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public ModbusFactory modbusFactory(){
        return new ModbusFactory();
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public IpParameters ipParameters(){
        return new IpParameters();
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public SerialParameters serialParameters(){
        return new SerialParameters();
    }

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm");
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public Date getDate(){
        return new Date();
    }

    @Bean
    public SHA256PasswordEncoder sha256PasswordEncoder() {
        return new SHA256PasswordEncoder();
    }
}
