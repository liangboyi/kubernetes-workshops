package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bliang on 25/03/2018.
 */
@RestController
public class DemoController {
    @Value("${Deploy.version:none}")
    String version;

    @RequestMapping("/")
    public String index(){
        return "This is Version: ["+ version +"]";
    }
}
