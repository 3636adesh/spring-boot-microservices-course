package com.malunjkar.domain.models;

import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    public String getLoginUserName() {
       return "user";

    }
}
