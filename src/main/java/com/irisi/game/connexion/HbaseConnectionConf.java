package com.irisi.game.connexion;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class HbaseConnectionConf {
//    private static final String PROJECT_ID = "[YOUR_PROJECT_ID]";
//    private static final String INSTANCE_ID = "[YOUR_INSTANCE_ID]";
//    public static final Connection connection = BigtableConfiguration.connect(PROJECT_ID, INSTANCE_ID);

    @Bean
    public Connection useConnection() throws IOException {
        return ConnectionFactory.createConnection(HBaseConfiguration.create());
    }
}
