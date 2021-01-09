package com.debuggsbunny.quizdemo.repositories;

import com.debuggsbunny.quizdemo.models.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<Response,Integer> {
}
