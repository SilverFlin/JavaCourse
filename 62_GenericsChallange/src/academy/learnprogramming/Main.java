package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        /*
        Classes:
        League<T extends Team>
        Team<Sport>
        Sport
        Sport1 -> Sport
        Sport2 -> Sport
         */

        League<soccerPlayer> league = new League<>("Soccer League");

        soccerPlayer soccerPlayer1 = new soccerPlayer("Luis");
        soccerPlayer soccerPlayer2 = new soccerPlayer("Angel");
        soccerPlayer soccerPlayer3 = new soccerPlayer("Toledo");
        Team<soccerPlayer> soccerTeam1 = new Team<>("soccerTeam1");


        soccerTeam1.addRankingPoints(10);

        soccerPlayer soccerPlayer11 = new soccerPlayer("Luis");
        soccerPlayer soccerPlayer22 = new soccerPlayer("Angel");
        soccerPlayer soccerPlayer33 = new soccerPlayer("Toledo");
        Team<soccerPlayer> soccerTeam2 = new Team<>("soccerTeam1");
        soccerTeam2.addRankingPoints(5);

        soccerPlayer soccerPlayer111 = new soccerPlayer("Luis");
        soccerPlayer soccerPlayer222 = new soccerPlayer("Angel");
        soccerPlayer soccerPlayer333 = new soccerPlayer("Toledo");

        Team<soccerPlayer> soccerTeam3 = new Team<>("soccerTeam1");
        soccerTeam3.addRankingPoints(3);
        soccerPlayer soccerPlayer1111 = new soccerPlayer("Luis");
        soccerPlayer soccerPlayer22222 = new soccerPlayer("Angel");
        soccerPlayer soccerPlayer33333 = new soccerPlayer("Toledo");

        Team<soccerPlayer> soccerTeam4 = new Team<>("soccerTeam1");
        soccerTeam4.addRankingPoints(20);

        league.addTeam(soccerTeam1);
        league.addTeam(soccerTeam2);
        league.addTeam(soccerTeam3);
        league.addTeam(soccerTeam4);

        league.printLeagueTable();
    }
}
