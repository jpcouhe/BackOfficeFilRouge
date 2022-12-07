package com.example.backofficefilrouge.Dao;

import com.example.backofficefilrouge.entity.UserrEntity;
import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoJpa implements UserDao<UserrEntity> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

    @Override
    public List<UserrEntity> findAll() {
        List<UserrEntity> userList = new ArrayList<>();

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction et = entityManager.getTransaction();

        try{
            et.begin();

            TypedQuery<UserrEntity> query = entityManager.createQuery("SELECT u from UserrEntity u", UserrEntity.class);
            userList = query.getResultList();
            et.commit();


        }catch (Exception e){
            e.printStackTrace();
            if(et.isActive()) {et.rollback();}
        } finally {
            entityManager.close();
        }
        return userList;
    }

    @Override
    public Optional<UserrEntity> findById(int id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public UserrEntity update(UserrEntity userrEntity) {
        return null;
    }

    @Override
    public UserrEntity signUp(UserrEntity userrEntity) {
        return null;
    }

    @Override
    public UserrEntity logIn(String email, String psw) {
        return null;
    }
}
