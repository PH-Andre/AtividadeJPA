package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Worldcupmatches;
import model.Worldcups;

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
}
