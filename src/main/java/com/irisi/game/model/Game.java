package com.irisi.game.model;

import com.flipkart.hbaseobjectmapper.Family;
import com.flipkart.hbaseobjectmapper.HBColumn;
import com.flipkart.hbaseobjectmapper.HBRecord;
import com.flipkart.hbaseobjectmapper.HBTable;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@HBTable(name = "Game",
        families = {
                @Family(name = "main"),
                @Family(name = "game_data", versions = 3),
        }
)
public class Game implements HBRecord<String> {

    private String id;
    @HBColumn(family = "main", column = "game_name")
    private String game_name;
    @HBColumn(family = "game_data", column = "score")
    private Double score;
    @HBColumn(family = "game_data", column = "description")
    private String description;

    @Override
    public String composeRowKey() {
        return game_name;
    }

    @Override
    public void parseRowKey(String s) {

    }
}
