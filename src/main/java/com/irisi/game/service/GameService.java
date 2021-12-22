package com.irisi.game.service;

import com.irisi.game.dao.GameDao;
import com.irisi.game.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

import static org.springframework.http.RequestEntity.delete;

@Service
public class GameService {
    @Autowired
    private GameDao gameDao;

    //add new game
    public int createGame(Game game) throws IOException {
        String rowKey = gameDao.persist(game);
        if (rowKey == null || rowKey.isEmpty()) {
            return -1;
        }
        return 0;
    }

    public Game findGame(String rowKey) throws IOException {
            Game game = new Game() ;
            return  gameDao.get(rowKey)  ;
    }
    

      public int daleteGame(String rowKey) throws IOException {
        gameDao.delete(rowKey);
       return  1 ;  
      }

      

}
