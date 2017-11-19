package com.lxkang.authservice.proxy;

import com.lxkang.authservice.service.TestService;
import com.lxkang.authservice.spi.TestApi;

public class TestProxy implements TestApi {

    private TestService testService;

    public void read() {
        System.out.println("asd");
    }
}
