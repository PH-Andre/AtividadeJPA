package model;

public class AnoEspecif {
private String dataFinal;
private String Stadio;
private String time1;
private String time2;
private int placar1;
private int placar2;
private String condicaoEspecial;
private String paisSede;


        public String getDataFinal() {
            return dataFinal;
        }

    public int getPlacar1() {
        return placar1;
    }

    public void setPlacar1(int placar1) {
        this.placar1 = placar1;
    }

    public int getPlacar2() {
        return placar2;
    }

    public void setPlacar2(int placar2) {
        this.placar2 = placar2;
    }

    public void setDataFinal(String dataFinal) {
            this.dataFinal = dataFinal;
        }

        public String getStadio() {
            return Stadio;
        }

        public void setStadio(String stadio) {
            Stadio = stadio;
        }

        public String getTime1() {
            return time1;
        }

        public void setTime1(String time1) {
            this.time1 = time1;
        }

        public String getTime2() {
            return time2;
        }

        public void setTime2(String time2) {
            this.time2 = time2;
        }

        public String getCondicaoEspecial() {
            return condicaoEspecial;
        }

        public void setCondicaoEspecial(String condicaoEspecial) {
            this.condicaoEspecial = condicaoEspecial;
        }

        public String getPaisSede() {
            return paisSede;
        }

        public void setPaisSede(String paisSede) {
            this.paisSede = paisSede;
        }

        @Override
        public String toString() {
            return
                    "Data da Final= '" + dataFinal + '\'' +
                    ", Estadio= '" + Stadio + '\'' +
                    ", Time 1 = '" + time1 + " Gols: " + placar1 +'\'' +
                    ", Time 2='" + time2 + " Gols: "+ placar2 +'\'' +
                    '\'' +
                    ", Condicao especial='" + condicaoEspecial + '\'' +
                    ", Pais Sede='" + paisSede + '\'' +
                    '}';
        }
}

