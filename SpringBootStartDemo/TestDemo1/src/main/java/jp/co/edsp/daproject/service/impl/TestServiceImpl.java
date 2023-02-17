package jp.co.edsp.daproject.service.impl;

import jp.co.edsp.daproject.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "hello";
    }
}
