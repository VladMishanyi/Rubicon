package com.vk.controller.rest;

import com.vk.controller.WebController;
import com.vk.entity.json.JsonBodyInt;
import com.vk.entity.json.JsonBodyString;
import com.vk.service.IModbusServiceRightWinderPLC110;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KIP-PC99 on 15.01.2019.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.entity.json"})
public class WinderController {

    private final Logger LOGGER = Logger.getLogger(WinderController.class);

    private final IModbusServiceRightWinderPLC110 iModbusServiceRightWinderPLC110;

    @Autowired
    public WinderController(final IModbusServiceRightWinderPLC110 iModbusServiceRightWinderPLC110) {
        this.iModbusServiceRightWinderPLC110 = iModbusServiceRightWinderPLC110;
    }

    @MessageMapping(value = "/send-winder-right-set-length")
    public void getSendWinderRightSetLength(final JsonBodyInt jsonBodyInt){
        int val = jsonBodyInt.getValue();

        if ( (val >= 0) && (val <= 2000) ){
            iModbusServiceRightWinderPLC110.writeDataToRegister0(val);
        } else{
            LOGGER.error("Set value out of bound length :"+val);
            System.out.println("Set value out of bound length :"+val);
        }
    }
}
