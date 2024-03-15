package com.jbr.javaschoolwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("name")
public class LoginController {

    @Autowired
    LoginService service;


}
