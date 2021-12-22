package com.irisi.game.rest;

import com.irisi.game.model.Game;
import com.irisi.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/game")
public class GameRest {

    @Autowired
    GameService gameService;

    @PostMapping(value = "/")
    public int createUser(@RequestBody Game game) throws IOException {
        return gameService.createGame(game);

    }

    @GetMapping("/findGame/{rowKey}")
       public Game findGame(@PathVariable  String rowKey) throws IOException {
         return  gameService.findGame(rowKey) ;
       }

    @DeleteMapping("/deleteGame/{rowkey}")

    public int deleteGame(String rowKey) throws IOException {
       return gameService.daleteGame(rowKey) ;
    }

}
