package com.czq.controller;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 必须加上@Validated，否则无法校验
 * 
 * @AssertFalse 所注解的元素必须是Boolean类型，且值为false
 * @AssertTrue 所注解的元素必须是Boolean类型，且值为true
 * @DecimalMax 所注解的元素必须是数字，且值小于等于给定的值
 * @DecimalMin 所注解的元素必须是数字，且值大于等于给定的值
 * @Digits 所注解的元素必须是数字，且值必须是指定的位数
 * @Future 所注解的元素必须是将来某个日期
 * @Max 所注解的元素必须是数字，且值小于等于给定的值
 * @Min 所注解的元素必须是数字，且值小于等于给定的值
 * @Range 所注解的元素需在指定范围区间内
 * @NotNull 所注解的元素值不能为null
 * @NotBlank 所注解的元素值有内容
 * @Null 所注解的元素值为null
 * @Past 所注解的元素必须是某个过去的日期
 * @PastOrPresent 所注解的元素必须是过去某个或现在日期
 * @Pattern 所注解的元素必须满足给定的正则表达式
 * @Size 所注解的元素必须是String、集合或数组，且长度大小需保证在给定范围之内
 * @Email 所注解的元素需满足Email格式
 * @author   czq
 * @Date 2020-05-29 10:11:06    
 */
@RestController
@RequestMapping(value="/valid")
@Validated
public class ValidatedController {

	@RequestMapping(value="/notNull", method=RequestMethod.GET)
    public String getUserStr(@NotNull(message = "name 不能为空") String name) {
        return "name: " + name ;
    }
	
	@RequestMapping(value="/assertFalse", method=RequestMethod.GET)
    public String getUserStrFalse(@AssertFalse(message = "name 必须是Boolean类型，且值为false") Boolean name) {
        return "name: " + name ;
    }
	
	@RequestMapping(value="/assertTrue", method=RequestMethod.GET)
    public String getUserStrTrue(@AssertTrue(message = "name 必须是Boolean类型，且值为true") Boolean name) {
        return "name: " + name ;
    }
	
	@RequestMapping(value="/decimalMax", method=RequestMethod.GET)
    public String getUserStrMax(@DecimalMax(message = "name 必须是数字，且值小于等于给定的值", value = "5") Integer name) {
        return "name: " + name ;
    }
	
	@RequestMapping(value="/decimalMin", method=RequestMethod.GET)
    public String getUserStrMin(@DecimalMin(message = "name 必须是数字，且值大于等于给定的值", value = "5") Integer name) {
        return "name: " + name ;
    }
	
	
	
}
