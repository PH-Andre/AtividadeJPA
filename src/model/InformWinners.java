package model;

public class InformWinners {
    private String paisSede;
    private String camp;
    private String viceCamp;

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    public String getCamp() {
        return camp;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }

    public String getViceCamp() {
        return viceCamp;
    }

    public void setViceCamp(String viceCamp) {
        this.viceCamp = viceCamp;
    }

    @Override
    public String toString() {
        return "InformWinners{" +
                "Pais Sede='" + paisSede + '\'' +
                ", Campeão='" + camp + '\'' +
                ", Vice Campeão='" + viceCamp + '\'' +
                '}';
    }
}
