package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Player> {
    String name;
    ArrayList<Team<T>> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(Team<T> team) {

        if (teams.contains(team)) {
            System.out.println("Player " + team.getName() + " is already on the team " + this.name);
            return false;
        } else {
            teams.add(team);
            return true;
        }

    }

    public void printLeagueTable() {
        Collections.sort(teams);

        for (Team<T> team : teams) {
            System.out.println(team.getName() + ": " + team.getRanking());
        }

    }
}
