package code.part4.FilesAndReadingData;

import java.util.ArrayList;

public class Results
{
    private String homeTeam;
    private String awayTeam;
    private int homeTeamPoints;
    private int awayTeamPoints;

    public Results(String homeTeam, String awayTeam, int homeTeamPoints, int awayTeamPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.awayTeamPoints = awayTeamPoints;
    }

    public boolean checkNameBool(String name) {
        return this.homeTeam.equals(name) | this.awayTeam.equals(name);
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    public int getHomeTeamPoints() {
        return this.homeTeamPoints;
    }

    public int getAwayTeamPoints() {
        return this.awayTeamPoints;
    }

    @Override
    public String toString() {
        return "Results{" +
                "homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeTeamPoints=" + homeTeamPoints +
                ", awayTeamPoints=" + awayTeamPoints +
                '}';
    }
}
