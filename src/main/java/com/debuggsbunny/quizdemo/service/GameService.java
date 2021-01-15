package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.models.Game;
import com.debuggsbunny.quizdemo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public Optional<Game> getGameById(Integer id) {
        return gameRepository.findById(id);
    }

    public List<Game> getAllGame() {
        return gameRepository.findAll();
    }

    public Game addGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Game game) {
        return gameRepository.save(game);
    }

    public boolean deleteGameById(Integer id) {
        try {
            gameRepository.deleteById(id);
        }
        catch (Exception ex){
            return false;
        }
        return true;
    }

    public String getGameStatusById(Integer id) {
        return gameRepository.findById(id).get().getStatus().toString();
    }
}
