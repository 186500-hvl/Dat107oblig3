package Dao;

import model.Avdeling;

import javax.persistence.*;

public class AvdelingDAO {
    private EntityManager em;

    public AvdelingDAO(EntityManager em) {
        this.em = em;
    }

    public Avdeling finnAvdelingMedId(int id) {
        return em.find(Avdeling.class, id);
    }

    public void lagreNyAvdeling(Avdeling avdeling) {
        em.getTransaction().begin();
        em.persist(avdeling);
        em.getTransaction().commit();
    }
}

