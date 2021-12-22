package com.irisi.game;

import com.flipkart.hbaseobjectmapper.HBAdmin;
import com.irisi.game.model.Game;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class GameApplication implements CommandLineRunner {

	@Autowired
	private Connection connection;

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HBAdmin hbAdmin = HBAdmin.create(connection);
		hbAdmin.createTable(Game.class);
	}
}
