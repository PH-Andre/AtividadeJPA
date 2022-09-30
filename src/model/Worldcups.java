package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name="Worldcups.findAll", query="SELECT t FROM Worldcups t")
public class Worldcups {

    @Id
    private int year;
    private String country;
    private String winner;
    private String runnersUp;
    private String third;
    private String fourth;
    private int goalsScored;
    private int qualifiedTeams;
    private int matchesPlayed;
    private String attendance;

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public void setRunnersUp(String runnersUp) {
        this.runnersUp = runnersUp;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void setQualifiedTeams(int qualifiedTeams) {
        this.qualifiedTeams = qualifiedTeams;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getWinner() {
        return winner;
    }

    public String getRunnersUp() {
        return runnersUp;
    }

    public String getThird() {
        return third;
    }

    public String getFourth() {
        return fourth;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getQualifiedTeams() {
        return qualifiedTeams;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public String getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return "Worldcups{" +
                "year=" + year +
                ", country='" + country + '\'' +
                ", winner='" + winner + '\'' +
                ", runnersUp='" + runnersUp + '\'' +
                ", third='" + third + '\'' +
                ", fourth='" + fourth + '\'' +
                ", goalsScored=" + goalsScored +
                ", qualifiedTeams=" + qualifiedTeams +
                ", matchesPlayed=" + matchesPlayed +
                ", attendance='" + attendance + '\'' +
                '}';
    }
}


