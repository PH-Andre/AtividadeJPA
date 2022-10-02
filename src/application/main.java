package application;

import dao.MatchesDAO;
import dao.WorldcupsDAO;
import model.Worldcups;

public class main {
    public static void main(String[] args) {

        var func = new funcionalidades();
        var matches = new MatchesDAO();


      //  func.listaInformacoesCopas();

        func.InformacaoFinalEspecifica(1982);

        // adicionando nova Copa do
       var novaCopa = new Worldcups();
       novaCopa.setYear(2018);
       novaCopa.setCountry("Russia");
       novaCopa.setAttendance(	"3.031.768");
       novaCopa.setFourth("Inglatera");
       novaCopa.setQualifiedTeams(32);
       novaCopa.setGoalsScored(169);
       novaCopa.setThird("Belgica");
       novaCopa.setWinner("França");
       novaCopa.setRunnersUp("Croacia");
       novaCopa.setMatchesPlayed(64);

       //func.addWorldcup(novaCopa);

       func.desempenho("Brazil");




    }


}
