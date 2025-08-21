package com.aln.day3;

import java.util.List;
import java.util.Map;

public class IplStatsServiceImpl implements IplStatsService {

    private List<Player> players;

    public IplStatsServiceImpl(){
        players = JsonUtil.loadPlayersFromJsonFile();
    }

    @Override
    public List<String> getTeamNames() {
        return players.stream()
                .map(p->p.getTeam())
                .distinct()
                .toList();
    }

    @Override
    public List<Player> getPlayers(String teamName) {
        return players.stream()
                .filter(p->p.getTeam().equals(teamName))
                .toList();
    }

    @Override
    public IplStatsDto getIplStats() {
            double totalAmount = players.stream()
                    .mapToDouble(p->p.getPrice())
                    .sum();

            long totalPlayers = players.stream()
                    .count();

            double avgPrice = players.stream()
                    .mapToDouble(p->p.getPrice())
                    .average()
                    .orElse(0);

            double maxPrice = players.stream()
                    .mapToDouble(p->p.getPrice())
                    .max()
                    .orElse(0);

            double minPrice = players.stream()
                    .mapToDouble(p->p.getPrice())
                    .min()
                    .orElse(0);

            IplStatsDto iplStatsDto = new IplStatsDto();
            iplStatsDto.setTotalAmount(totalAmount);
            iplStatsDto.setTotalPlayers(totalPlayers);
            iplStatsDto.setAvgPrice(avgPrice);
            iplStatsDto.setMaxPrice(maxPrice);
            iplStatsDto.setMinPrice(minPrice);
            return iplStatsDto;

    }

    @Override
    public List<Player> topPaidPlayers(int limit) {
        return List.of();
    }

    @Override
    public Map<String, Long> getPlayersCountByTeam() {
       return null;
    }

    @Override
    public List<RoleStatsDto> getRoleStats(String teamName) {
        return List.of();
    }

    @Override
    public Map<String, List<RoleStatsDto>> getRoleStats() {
        return Map.of();
    }


}
