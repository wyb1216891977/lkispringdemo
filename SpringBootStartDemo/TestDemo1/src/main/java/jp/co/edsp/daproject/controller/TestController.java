package jp.co.edsp.daproject.controller;

import jp.co.edsp.daproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.test();
    }
}
