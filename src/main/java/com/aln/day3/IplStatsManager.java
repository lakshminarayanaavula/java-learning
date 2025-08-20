package com.aln.day3;

import java.util.List;

public class IplStatsManager {
    public static void main(String[] args) {

        IplStatsService iplStatsService = new IplStatsServiceImpl();

        IplStatsDto iplStatsDto = iplStatsService.getIplStats();

        System.out.println("Total Amount: " + iplStatsDto.getTotalAmount());
        System.out.println("Total Players: " + iplStatsDto.getTotalPlayers());
        System.out.println("Average Price: " + iplStatsDto.getAvgPrice());
        System.out.println("Maximum Price: " + iplStatsDto.getMaxPrice());
        System.out.println("Minimum Price: " + iplStatsDto.getMinPrice());

        List<String> teamNames = iplStatsService.getTeamNames();
        for (String teamName : teamNames) {
            System.out.println("Team Name: " + teamName);
            List<Player> players = iplStatsService.getPlayers(teamName);
            for (Player player : players) {
                System.out.println("Player Name: " + player.getName() + ", Role: " + player.getRole() + ", Price: " + player.getPrice());
            }
            System.out.println("----------------------------------");
        }


    }
}
