package it.unikey.azure.springsecurityazuredemo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {

    @GetMapping( "/home")
    @PreAuthorize("hasAnyAuthority('SCOPE_File.Write', 'SCOPE_File.Read')")
    public ResponseEntity<String> home(Principal principal) {
        return new ResponseEntity<>("{\"str\":\"home ... file.write and file.read scope\", \"prn\": \""+principal.toString()+"\"}", HttpStatus.OK);
    }

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('SCOPE_File.Read')")
    public ResponseEntity<String> group1() {
        return new ResponseEntity<>("{\"str\":\"hello caro\"}", HttpStatus.OK);
    }
}
