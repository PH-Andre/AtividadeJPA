package application;

import dao.MatchesDAO;
import dao.WorldcupsDAO;

public class main {
    public static void main(String[] args) {

        var cupDao = new WorldcupsDAO();
        var matches = new MatchesDAO();

        System.out.println(cupDao.getAll());
    }
}
