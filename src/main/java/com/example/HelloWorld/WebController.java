package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class WebController {

    InetAddress ip;
    String hostname;
    @GetMapping("/")
    public String getMsg() throws UnknownHostException {
        ip = InetAddress.getLocalHost();
        hostname = ip.getHostAddress();

        return "Hello World from IP: " + ip + " Host: " + hostname;
    }

}
