package com.debuggsbunny.quizdemo.repositories;

import com.debuggsbunny.quizdemo.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
