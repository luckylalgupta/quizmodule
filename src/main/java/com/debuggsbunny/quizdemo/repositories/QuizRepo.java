package com.debuggsbunny.quizdemo.repositories;

import com.debuggsbunny.quizdemo.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepo extends JpaRepository<Quiz,Integer> {
}
