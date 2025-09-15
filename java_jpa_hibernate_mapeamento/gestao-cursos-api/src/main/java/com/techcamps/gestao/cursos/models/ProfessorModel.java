package com.techcamps.gestao.cursos.models;

import com.techcamps.gestao.cursos.entities.Professor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProfessorModel {

    public void create(Professor professor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
        EntityManager em = emf.createEntityManager();
        try {
            System.out.println("Iniciando a transação para o professor");
            em.getTransaction().begin();
            em.persist(professor);
            em.getTransaction().commit();
            System.out.println("Professor criado com sucesso !!!");
        } catch (Exception e) {
            System.err.println("Erro ao criar um professor !!!" + e.getMessage());
            e.printStackTrace();
        } finally {
            em.close();
            System.out.println("Finalizando a transação para o professor");
        }
    }
}