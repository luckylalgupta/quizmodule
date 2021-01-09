package com.debuggsbunny.quizdemo.repositories;

import com.debuggsbunny.quizdemo.models.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
}