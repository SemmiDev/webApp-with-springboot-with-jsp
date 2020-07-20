package com.sammidev.belajar.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(String userid, String password) {
        // sammidev, sammidev
        return userid.equalsIgnoreCase("sammidev")
                && password.equalsIgnoreCase("sammidev");
    }
}
