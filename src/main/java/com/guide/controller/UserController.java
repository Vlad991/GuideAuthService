package com.guide.controller;

import com.guide.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping(value = "/me")
    public ResponseEntity<?> createAuthenticationToken() throws Exception {
        return ResponseEntity.ok(new UserDTO(
                1L,
                "foo",
                "$2a$04$uuJcqqFvSlvI1d.E1oJHKeOCSunbz0RPwL4gzolMMWsHTq/.yc8Ei",
                "foo@gmail.com",
                "foo.facebook.com",
                "foo.google.com",
                new ArrayList<>()
        ));
    }
}
