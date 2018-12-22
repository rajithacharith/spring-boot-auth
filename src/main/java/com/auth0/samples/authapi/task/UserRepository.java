package com.auth0.samples.authapi.task;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
