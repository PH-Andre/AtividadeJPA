package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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
