package com.vk.controller.authorization;

import com.vk.exception.ExceptionMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public final class IllegalAccessController {

    @RequestMapping(
            value = "/illegal_access_exception",
            method = RequestMethod.GET
    )
    public void getIllegalAccessException() throws IllegalAccessException {
        throw new IllegalAccessException(ExceptionMessage.ILLEGAL_ACCESS_MESSAGE);
    }
}
