package com.example.factorymethodex.factory;

import com.example.factorymethodex.domain.User;
import com.example.factorymethodex.dto.UserRegisterReq;

public interface UserFactory {
    User create(UserRegisterReq req);
}
