package com.debuggsbunny.quizdemo.repositories;

import com.debuggsbunny.quizdemo.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends JpaRepository<Answer,Integer> {
}
