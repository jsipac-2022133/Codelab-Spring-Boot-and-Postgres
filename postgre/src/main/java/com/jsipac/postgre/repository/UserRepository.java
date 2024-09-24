package com.jsipac.postgre.repository;

import com.jsipac.postgre.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
