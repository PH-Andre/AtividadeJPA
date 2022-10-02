package application;

import dao.MatchesDAO;
import dao.WorldcupsDAO;
import model.AnoEspecif;
import model.InformWinners;
import model.Worldcupmatches;
import model.Worldcups;

import java.util.List;
import java.util.Optional;

public class funcionalidades {

    public void listaInformacoesCopas(){
        var cupDao = new WorldcupsDAO();
        List<Worldcups> geral = cupDao.getAll();

        for (int i = 0; i < geral.size(); i++) {
            Worldcups temp1 = geral.get(i);

            InformWinners temp = new InformWinners();
            temp.setCamp(temp1.getWinner());
            temp.setPaisSede(temp1.getCountry());
            temp.setViceCamp(temp1.getRunnersUp());

            System.out.println(temp);
        }

    }

    public void InformacaoFinalEspecifica(int ano){
        var matche = new MatchesDAO();
        var cup = new WorldcupsDAO();
        Optional<Worldcupmatches> wCupMAts = matche.get(ano);
        Optional<Worldcups> cupsWord = cup.get(ano);

        if (cupsWord != null){

        AnoEspecif resultadoFinal = new AnoEspecif();

        resultadoFinal.setPaisSede(cupsWord.get().getCountry());
        resultadoFinal.setCondicaoEspecial(wCupMAts.get().getWin_conditions());
        resultadoFinal.setDataFinal(wCupMAts.get().getDatetime());
        resultadoFinal.setStadio(wCupMAts.get().getStadium());
        resultadoFinal.setTime1(wCupMAts.get().getHome_team_name());
        resultadoFinal.setPlacar1(wCupMAts.get().getHome_team_goals());
        resultadoFinal.setTime2(wCupMAts.get().getAway_team_name());
        resultadoFinal.setPlacar2(wCupMAts.get().getAway_team_goals());

        System.out.println(resultadoFinal);}else {
            System.out.println("DATA DA COPA INVALIDA");
        }
    }

    public void addWorldcupsMatch(Worldcupmatches novofinal){
        var cup = new WorldcupsDAO();
        var matche = new MatchesDAO();
        Optional<Worldcups> cupsWord = cup.get(novofinal.getYear_cup());
        if (cupsWord.get().getYear() == novofinal.getYear_cup()){
            matche.save(novofinal);
        }else{
            System.out.println("Sem copa no mundo cadastrada para definir uma final");
        }
    }

    public void addWorldcup(Worldcups novacopa){
        var cup = new WorldcupsDAO();
        List<Worldcups> geral = cup.getAll();
        Boolean jaexiste = false;

        for (int i = 0; i < geral.size(); i++) {
            Worldcups temp1 = geral.get(i);
            if(temp1.getYear() == novacopa.getYear() ){
                System.out.println("Copa ja cadastrada");
                jaexiste = true;
                break;
            }
        }
        if (jaexiste == false){
            cup.save(novacopa);
        }
    }

    public void desempenho(String selecao){
        var cup = new WorldcupsDAO();
        List<Worldcups> geral = cup.getAll();

        for (int i = 0; i < geral.size(); i++) {
            Worldcups temp1 = geral.get(i);
           if (temp1.getWinner().equals(selecao)){
               System.out.println("Ano: "+ temp1.getYear()+"  Pais Sede: " + temp1.getCountry() + "  Colocacao da " + selecao +" : 1");

           }else if (temp1.getRunnersUp().equals(selecao)){
               System.out.println("Ano: "+ temp1.getYear()+"  Pais Sede: " + temp1.getCountry() + "  Colocacao da " + selecao +" : 2");
           }
           else if (temp1.getThird().equals(selecao)){
               System.out.println("Ano: "+ temp1.getYear()+"  Pais Sede: " + temp1.getCountry() + "  Colocacao da " + selecao +" : 3" );
           }
           else if (temp1.getFourth().equals(selecao)){
               System.out.println("Ano: "+ temp1.getYear()+"  Pais Sede: " + temp1.getCountry() + "  Colocacao da " + selecao +" : 4");
           }
        }


    }


}
