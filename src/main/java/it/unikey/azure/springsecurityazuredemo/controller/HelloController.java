package it.unikey.azure.springsecurityazuredemo.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    @GetMapping("/group1")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_group1')")
    public String group1(Principal principal) {
        return "hello Group1 users, this is the " + principal.getName();
    }

    @GetMapping("/group2")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_group2')")
    public String group2() {
        return "hello Group2  users";
    }
}
