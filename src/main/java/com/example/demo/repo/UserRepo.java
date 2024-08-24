package com.example.demo.repo;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value="SELECT * from User where userId = ?1")
    User getUserByUserId(String userId);
}
