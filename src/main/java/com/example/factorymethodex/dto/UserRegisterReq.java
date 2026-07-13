package com.example.factorymethodex.dto;

import com.example.factorymethodex.domain.Role;

public record UserRegisterReq(
        String name,
        String email,
        Role role,
        String userNo,
        String department
) {
}
