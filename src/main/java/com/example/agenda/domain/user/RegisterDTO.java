package com.example.agenda.domain.user;

public record RegisterDTO(
        String login,
        String password,
        String person_name,
        UserRole role
) {
}
