package jp.co.desp.daproject.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConditionalOnProperty(name="comparion-site.endpoint.enabled",havingValue = "true")
public class TestController {

    //测试接口
	@PostMapping("${comparion-site.endpoint.url.standardizeFields}")
    public String test() {
        return String.format("<h1><center style=\"color:red;font-style:italic;\">%s</center></h1>",
                "Welcome to use SpringBoot of Gradle!");
    }

}
