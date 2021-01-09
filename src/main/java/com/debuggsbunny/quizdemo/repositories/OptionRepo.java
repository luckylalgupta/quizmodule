package com.debuggsbunny.quizdemo.repositories;

import com.debuggsbunny.quizdemo.models.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepo extends JpaRepository<Option,Integer> {
}
