package org.example.controller;

import org.example.service.ICityStuService;
import org.example.vo.cityStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class cityStuController {
    @Autowired
    private ICityStuService cityStuService;

    //取数据
    @RequestMapping(value = "/ajaxGetData.do", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<cityStu> getData(){
        List<cityStu> data=cityStuService.dataSet();
        cityStuService.dataSet();
        System.out.println(data.toString());

        return data;// 框架使用MappingJackson2HttpMessageConverter类将java类型转换为json字符串放在response
        // body中
    }
}
