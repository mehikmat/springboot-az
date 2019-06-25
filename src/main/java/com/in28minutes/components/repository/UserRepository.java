package com.in28minutes.components.repository;

import com.in28minutes.components.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
