package com.example.factorymethodex.controller;

import com.example.factorymethodex.dto.UserRegisterReq;
import com.example.factorymethodex.dto.UserRes;
import com.example.factorymethodex.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<UserRes> register(
            @RequestBody UserRegisterReq registerReq
            ) {

        UserRes response = userService.register(registerReq);

        return ResponseEntity.ok(response);

    }
}
