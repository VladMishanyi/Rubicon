package com.vk.controller.rest;

import com.vk.controller.WebController;
import com.vk.entity.json.JsonBodyFloat;
import com.vk.entity.json.JsonBodyInt;
import com.vk.entity.json.JsonBodyString;
import com.vk.service.IModbusServiceLeftWinderPLC110;
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

    private final IModbusServiceLeftWinderPLC110 iModbusServiceLeftWinderPLC110;

    @Autowired
    public WinderController(final IModbusServiceRightWinderPLC110 iModbusServiceRightWinderPLC110,
                            final IModbusServiceLeftWinderPLC110 iModbusServiceLeftWinderPLC110) {
        this.iModbusServiceRightWinderPLC110 = iModbusServiceRightWinderPLC110;
        this.iModbusServiceLeftWinderPLC110 = iModbusServiceLeftWinderPLC110;
    }

    @MessageMapping(value = "/send-winder-right-set-length")
    public void getSendWinderRightSetLength(final JsonBodyFloat jsonBodyFloat){
        float val = jsonBodyFloat.getValue();

        if ( (val >= 0F) && (val <= 2000F) ){
            iModbusServiceRightWinderPLC110.writeDataToRegister0(val);
        } else{
            LOGGER.error("Set value right wider out of bound length :"+val);
            System.out.println("Set value right wider out of bound length :"+val);
        }
    }

    @MessageMapping(value = "/send-winder-left-set-length")
    public void getSendWinderLeftSetLength(final JsonBodyFloat jsonBodyFloat){
        float val = jsonBodyFloat.getValue();

        if ( (val >= 0F) && (val <= 2000F) ){
            iModbusServiceLeftWinderPLC110.writeDataToRegister0(val);
        } else{
            LOGGER.error("Set value right wider out of bound length :"+val);
            System.out.println("Set value right wider out of bound length :"+val);
        }
    }
}
