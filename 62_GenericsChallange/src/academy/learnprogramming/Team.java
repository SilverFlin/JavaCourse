package academy.learnprogramming;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int ranking = 0;
    ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getRanking() {
        return ranking;
    }

    public void addRankingPoints(int amount){
        this.ranking+=amount;
    }

    public boolean addNewPlayer(T player){
        if(members.contains(player)){
            System.out.println("Player " + player.getName() + " is already on the team " + this.name);
            return false;
        }else{
            members.add(player);
            return true;
        }
    }



    @Override
    public int compareTo(Team<T> team) {
        // return Integer.compare(team.getRanking(), this.ranking);

        if (this.ranking < team.getRanking()) {
            return 1;
        } else if (this.ranking == team.getRanking()) {
            return 0;
        } else return -1;
    }
}
