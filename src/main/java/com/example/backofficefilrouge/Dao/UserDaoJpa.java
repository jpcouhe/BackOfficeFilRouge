package com.example.backofficefilrouge.Dao;

import com.example.backofficefilrouge.entity.UsersEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoJpa implements UserDao<UsersEntity> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

    @Override
    public List<UsersEntity> findAll() {
        List<UsersEntity> userList = new ArrayList<>();

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction et = entityManager.getTransaction();

        try{
            et.begin();

            TypedQuery<UsersEntity> query = entityManager.createQuery("SELECT u from UsersEntity u", UsersEntity.class);
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
    public Optional<UsersEntity> findById(int id) {
        return Optional.empty();
    }

    public Optional<UsersEntity> findByMail(String mail) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            UsersEntity user = em.createQuery("SELECT u FROM UsersEntity u WHERE u.userEmail = :mailParam", UsersEntity.class)
                    .setParameter("mailParam", mail)
                    .getSingleResult();
            et.commit();
            return Optional.of(user);
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        return Optional.empty();
    }

    public Optional<UsersEntity> findByPsw(String psw) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            UsersEntity user = em.createQuery("SELECT u FROM UsersEntity u WHERE u.userPassword = :pswParam", UsersEntity.class)
                    .setParameter("pswParam", psw)
                    .getSingleResult();
            et.commit();
            return Optional.of(user);
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        return Optional.empty();
    }

//    public boolean findByIsAdmin(int role) {
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        try {
//            et.begin();
//            UsersEntity user = em.createQuery("SELECT u FROM UsersEntity u WHERE u.roleId = 2", UsersEntity.class)
//                    .getSingleResult();
//            et.commit();
//            return Optional.of(user);
//        } catch (Exception e) {
//            if (et.isActive()) {
//                et.rollback();
//            }
//        } finally {
//            em.close();
//        }
//        return Optional.empty();
//    }
    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public UsersEntity update(UsersEntity userrEntity) {
        return null;
    }

    @Override
    public UsersEntity signUp(UsersEntity userrEntity) {
        return null;
    }

    @Override
    public UsersEntity logIn(String email, String psw) {
        return null;
    }
}
