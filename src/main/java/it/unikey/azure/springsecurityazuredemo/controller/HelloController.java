package it.unikey.azure.springsecurityazuredemo.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {

    @GetMapping("/group1")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_myrole')")
    public String group1() {
        return "hello Group1 users, this is the ";
    }

    @GetMapping("/group2")
    @ResponseBody
    public String group2() {
        return "hello Group2  users";
    }
}
