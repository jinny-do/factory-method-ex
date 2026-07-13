package com.example.factorymethodex.service;

import com.example.factorymethodex.domain.User;
import com.example.factorymethodex.dto.UserRegisterReq;
import com.example.factorymethodex.dto.UserRes;
import com.example.factorymethodex.factory.UserFactory;
import com.example.factorymethodex.factory.UserFactoryProvider;
import org.springframework.stereotype.Service;

@Service
public class UserService {
        public UserRes register(UserRegisterReq req) {

            UserFactory factory = UserFactoryProvider.getFactory(req.role());

            User user = factory.create(req);

            return UserRes.from(user);
        }
}
