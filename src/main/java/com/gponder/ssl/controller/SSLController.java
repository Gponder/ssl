package com.gponder.ssl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/11/23 17:10
 */
@RestController
@RequestMapping("ssl")
public class SSLController {

    @GetMapping("time")
    public Date time(){
        return new Date(System.currentTimeMillis());
    }
}
