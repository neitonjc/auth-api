package com.njc.auth_api.dtos;

import com.njc.auth_api.enums.UserRole;

public record RegisterDto(String login, String password, UserRole role) {
}
