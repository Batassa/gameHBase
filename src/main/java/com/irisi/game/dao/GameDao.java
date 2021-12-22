package com.irisi.game.dao;

import com.irisi.game.model.Game;
import org.apache.hadoop.hbase.client.Connection;
import com.flipkart.hbaseobjectmapper.AbstractHBDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GameDao extends AbstractHBDAO<String, Game> {

    public GameDao(Connection connection) throws IOException {
        super(connection);
    }
}