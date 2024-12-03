package com.otbasybank.infrastructure.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    public String testData (String data){
        return data += "yoy";
    }
}
