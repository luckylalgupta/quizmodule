package com.debuggsbunny.quizdemo.repositories;

import com.debuggsbunny.quizdemo.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Integer> {

}
