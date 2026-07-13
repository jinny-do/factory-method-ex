package com.example.factorymethodex.factory;

import com.example.factorymethodex.domain.Role;
import com.example.factorymethodex.domain.User;
import com.example.factorymethodex.dto.UserRegisterReq;

public class ProfessorFactory implements com.example.factorymethodex.factory.UserFactory {

    @Override
    public User create(UserRegisterReq req) {
        return new User(
                req.name()
                , req.email()
                , Role.PROFESSOR
        );
    }
}
