package com.njc.auth_api.repositories;

import com.njc.auth_api.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Integer> {

    UserDetails findByLogin(String login);
}
