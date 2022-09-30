package application;

import dao.MatchesDAO;
import dao.WorldcupsDAO;

public class main {
    public static void main(String[] args) {

        var func = new funcionalidades();
        var matches = new MatchesDAO();


      //  func.listaInformacoesCopas();

        func.InformacaoFinalEspecifica(1982);
       
        
    }
}
