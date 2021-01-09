package com.debuggsbunny.quizdemo.repositories;

import com.debuggsbunny.quizdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}