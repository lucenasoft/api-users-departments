package com.user.apiuserdep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.apiuserdep.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
