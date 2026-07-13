package com.example.factorymethodex.domain;

public record User(
        String name
        , String email
        , Role role
        , String userNo
        , String department
) {

}
