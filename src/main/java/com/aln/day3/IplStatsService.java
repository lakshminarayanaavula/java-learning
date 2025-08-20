package com.aln.day3;

import java.util.List;
import java.util.Map;

public interface IplStatsService {

        List<String> getTeamNames();
        List<Player> getPlayers(String teamName);
        IplStatsDto getIplStats();

        List<Player> topPaidPlayers(int limit);
        Map<String,Long> getPlayersCountByTeam();
        List<RoleStatsDto> getRoleStats(String teamName);
        Map<String,List<RoleStatsDto>> getRoleStats();


}
