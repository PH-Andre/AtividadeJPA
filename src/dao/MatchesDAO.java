package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.AnoEspecif;
import model.Worldcupmatches;
import model.Worldcups;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static dao.WorldcupsDAO.getPersistenceUnit;

public class MatchesDAO {

    private static final String PERSISTENCE_UNIT = "todos";

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(getPersistenceUnit());

        return factory.createEntityManager();
    }

    public Optional<Worldcupmatches> get(int year) {

        EntityManager em = getEntityManager();

        try {
          //  Query query = em.createQuery("Select  w.datetime, w.stadium, w.home_team_name, w.away_team_name , w.home_team_goals, w.away_team_goals, w.win_conditions, t.country FROM Worldcupmatches w, Worldcups t where w.year_cup = t.year and w.year_cup = "+year);
            Query query = em.createQuery("Select w FROM Worldcupmatches w where w.year_cup = "+year);
            Worldcupmatches worldCupFinal = (Worldcupmatches) query.getSingleResult();

            return Optional.ofNullable(worldCupFinal);


        } finally {
            em.close();
        }

    }




    public List<Worldcupmatches> getAll() {

        EntityManager em = getEntityManager();

        try {
            List<Worldcupmatches> todo = em.createNamedQuery("Worldcupmatches.findAll").getResultList();

            return todo;

        } finally {
            em.close();
        }
    }

    public void save(Worldcupmatches t) {

        var em = getEntityManager();

        try {
            em.getTransaction().begin();

            em.persist(t);

            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }
}
