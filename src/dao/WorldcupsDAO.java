package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Worldcups;

import java.util.List;
import java.util.Optional;

public class WorldcupsDAO {

        private static final String PERSISTENCE_UNIT = "todos";

        private EntityManager getEntityManager() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory(getPersistenceUnit());

            return factory.createEntityManager();
        }


        public Optional<Worldcups> get(long id) {

            var em = getEntityManager();

            try {
                var todo = em.find(Worldcups.class, id);

                return Optional.ofNullable(todo);

            } finally {
                em.close();
            }

        }

        @SuppressWarnings("unchecked")

        public List<Worldcups> getAll() {

            var em = getEntityManager();

            try {
                List<Worldcups> todos = em.createNamedQuery("Worldcups.findAll").getResultList();

                return todos;

            } finally {
                em.close();
            }
        }
/*
        @Override
        public void save(Todo t) {

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

        @Override
        public void update(Todo t) {

            var em = getEntityManager();

            try {
                em.getTransaction().begin();

                em.merge(t);

                em.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
            } finally {
                em.close();
            }
        }

        @Override
        public void delete(Todo t) {

            var em = getEntityManager();

            try {
                em.getTransaction().begin();

                em.remove(t);

                em.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
            } finally {
                em.close();
            }

        }  */
        public static String getPersistenceUnit() {
            return PERSISTENCE_UNIT;
        }



}