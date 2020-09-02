package com.atguigu.springboot.component;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @Author SunHao
 * @Date 2020/8/28 17:41
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
        errorAttributes.put("company","atguigu");

        Map<String,Object> ex = (Map<String,Object>)webRequest.getAttribute("ex", 0);
        errorAttributes.put("ex",ex);
        return errorAttributes;
    }
}
