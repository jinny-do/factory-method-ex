package com.example.factorymethodex.dto;

import com.example.factorymethodex.domain.Role;
import com.example.factorymethodex.domain.User;

public record UserRes(
        String name,
        String email,
        Role role
) {
    public static UserRes from(User user) {
        return new UserRes(
                user.name()
                , user.email()
                , user.role()
        );
    }
}
