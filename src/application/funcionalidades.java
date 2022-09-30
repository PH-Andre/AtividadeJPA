package application;

import dao.MatchesDAO;
import dao.WorldcupsDAO;
import model.InformWinners;
import model.Worldcupmatches;
import model.Worldcups;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(matche.get(ano));
    }
}
