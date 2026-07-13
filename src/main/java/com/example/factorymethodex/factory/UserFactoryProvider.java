package com.example.factorymethodex.factory;

import com.example.factorymethodex.domain.Role;

public class UserFactoryProvider {

    public static UserFactory getFactory(Role role) {
        return switch (role) {
            case STUDENT -> new StudentFactory();
            case PROFESSOR -> new ProfessorFactory();
            case ADMIN -> new AdminFactory();
            default -> throw new IllegalArgumentException(
                    "지원하지 않는 방식입니다: " + role
            );
        };
    }
}
