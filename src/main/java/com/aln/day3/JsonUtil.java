package com.aln.day3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonUtil {

    public static List<Player> loadPlayersFromJsonFile() {
        List<Player> players = null;
        try{
            ObjectMapper mapper = new ObjectMapper();
            players = mapper.readValue(JsonUtil.class.getResourceAsStream("/players.json"), new TypeReference<List<Player>>() {});
        }catch (Exception e){
            e.printStackTrace();
        }
        return players;
    }

}
