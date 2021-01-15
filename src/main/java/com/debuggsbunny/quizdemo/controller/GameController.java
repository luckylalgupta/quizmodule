package com.debuggsbunny.quizdemo.controller;

import com.debuggsbunny.quizdemo.models.Game;
import com.debuggsbunny.quizdemo.models.Response;
import com.debuggsbunny.quizdemo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/{id}")
    public Optional<Game> getGameById(@PathVariable("id") Integer id){
        return gameService.getGameById(id);
    }

    @GetMapping("/")
    public List<Game> getAllGame(){
        return gameService.getAllGame();
    }

    @PostMapping("/")
    public Game addGame(@RequestBody Game game){
        return gameService.addGame(game);
    }

    @PutMapping("/")
    public Game updateGame(@RequestBody Game game){
        return gameService.updateGame(game);
    }

    @DeleteMapping("/")
    public boolean deleteGameById(@PathVariable("id") Integer id){
        return gameService.deleteGameById(id);
    }

    @PutMapping("/{gameId}/responses")
    public Game addResponses(@PathVariable("gameId") Integer gameId, @RequestBody List<Response> responses){
        Game game = gameService.getGameById(gameId).get();
        game.setResponses(responses);
        gameService.updateGame(game);
        return game;
    }


}
