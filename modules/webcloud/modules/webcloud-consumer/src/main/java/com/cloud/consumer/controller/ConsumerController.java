package com.cloud.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/doAdd", method = RequestMethod.GET)
    public String doAdd(@RequestParam Integer a, @RequestParam Integer b) {
        logger.info("ConsumerController doAdd invoke.....");
        String paramStr="a="+a+"&b="+b;
        String url ="http://"+"webcloud-appa".toUpperCase()+"/web/add";
        String reqUrl =url+"?"+paramStr;
        logger.info("ConsumerController doAdd  reqUrl="+reqUrl);
        //return restTemplate.getForEntity(reqUrl, String.class).getBody();
        return invokeAdd(reqUrl);
    }

    @HystrixCommand(fallbackMethod = "failCallback")
    public String invokeAdd(String url) {
        return restTemplate.getForEntity(url, String.class).getBody();
    }

    public String failCallback() {
        return "remote invoke error";
    }

}
