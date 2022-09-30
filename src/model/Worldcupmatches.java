package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name="Worldcupmatches.findAll", query="SELECT t FROM Worldcupmatches t")
public class Worldcupmatches {
    private int year_cup;
    private String datetime;
    private String stage;
    private String stadium;
    private String city;
    private String home_team_name;
    private int home_team_goals;
    private int away_team_goals;
    private String away_team_name;
    private String win_conditions;
    private String referee;

    @Id
    private int matchID;
    private String home_team_initials;
    private String away_team_initials;

    public void setYear_cup(int year_cup) {
        this.year_cup = year_cup;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHome_team_name(String home_team_name) {
        this.home_team_name = home_team_name;
    }

    public void setHome_team_goals(int home_team_goals) {
        this.home_team_goals = home_team_goals;
    }

    public void setAway_team_goals(int away_team_goals) {
        this.away_team_goals = away_team_goals;
    }

    public void setAway_team_name(String away_team_name) {
        this.away_team_name = away_team_name;
    }

    public void setWin_conditions(String win_conditions) {
        this.win_conditions = win_conditions;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }

    public void setHome_team_initials(String home_team_initials) {
        this.home_team_initials = home_team_initials;
    }

    public void setAway_team_initials(String away_team_initials) {
        this.away_team_initials = away_team_initials;
    }

    public int getYear_cup() {
        return year_cup;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getStage() {
        return stage;
    }

    public String getStadium() {
        return stadium;
    }

    public String getCity() {
        return city;
    }

    public String getHome_team_name() {
        return home_team_name;
    }

    public int getHome_team_goals() {
        return home_team_goals;
    }

    public int getAway_team_goals() {
        return away_team_goals;
    }

    public String getAway_team_name() {
        return away_team_name;
    }

    public String getWin_conditions() {
        return win_conditions;
    }

    public String getReferee() {
        return referee;
    }

    public int getMatchID() {
        return matchID;
    }

    public String getHome_team_initials() {
        return home_team_initials;
    }

    public String getAway_team_initials() {
        return away_team_initials;
    }

    @Override
    public String toString() {
        return "Worldcupmatches{" +
                "year_cup=" + year_cup +
                ", datetime='" + datetime + '\'' +
                ", stage='" + stage + '\'' +
                ", stadium='" + stadium + '\'' +
                ", city='" + city + '\'' +
                ", home_team_name='" + home_team_name + '\'' +
                ", home_team_goals=" + home_team_goals +
                ", away_team_goals=" + away_team_goals +
                ", away_team_name='" + away_team_name + '\'' +
                ", win_conditions='" + win_conditions + '\'' +
                ", referee='" + referee + '\'' +
                ", matchID=" + matchID +
                ", home_team_initials='" + home_team_initials + '\'' +
                ", away_team_initials='" + away_team_initials + '\'' +
                '}';
    }
}
