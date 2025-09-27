package intro_pt1.part4.FilesAndReadingData;

public class Results
{
    private final String homeTeam;
    private final String awayTeam;
    private final int homeTeamPoints;
    private final int awayTeamPoints;

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
