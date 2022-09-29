package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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


