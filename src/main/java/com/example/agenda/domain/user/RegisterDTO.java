package com.example.agenda.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
