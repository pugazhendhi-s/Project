package projects.tournify;

import java.util.ArrayList;
/**
 *
 * Holds the list of Match objects to keep track of the matches completed
 */
public class MatchSchedule {
    private final ArrayList<Match> matches = new ArrayList<>();
    private ArrayList<Team> allTeams;

    MatchSchedule() { }

    MatchSchedule(ArrayList<Team> allTeams) {
        this.allTeams = allTeams;
    }

    /**
     * Gives a reference to a constant Array of Match Objects
     */
    ArrayList<Match> getMatches() {
        return this.matches;
    }

    ArrayList<Team> getAllTeams() {
        return this.allTeams;
    }

    /**
     * adds Match to the schedule array
     * @param m Match object passed
     */
    void addMatch(Match m) {
        matches.add(m);
    }

    void addMatch(Team team1, Team team2, int team1Points, int team2Points) {

        matches.add(new Match(team1, team2, team1Points, team2Points));
    }
}
