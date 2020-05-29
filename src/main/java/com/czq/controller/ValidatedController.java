package com.czq.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 必须加上@Validated，否则无法校验
 * @author   czq
 * @Date 2020-05-29 10:11:06    
 */
@RestController
@Validated
public class ValidatedController {

	@RequestMapping(value="/notNull", method=RequestMethod.GET)
    public String getUserStr(@NotNull(message = "name 不能为空") String name) {
        return "name: " + name ;
    }
	
}
