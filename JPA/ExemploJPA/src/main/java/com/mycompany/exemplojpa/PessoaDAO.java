package com.mycompany.exemplojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaDAO {
    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory(
            "PessoaPU");
    
    public void salvar (Pessoa pessoa){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        em.close();
    }
    
    public Pessoa buscar (Long id){
        EntityManager em = emf.createEntityManager();
        Pessoa p = em.find(Pessoa.class, id);
        em.close();
        return p;
    }
}
