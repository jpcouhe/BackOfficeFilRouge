package com.example.backofficefilrouge.Dao;

import com.example.backofficefilrouge.entity.UserrEntity;

import java.util.List;
import java.util.Optional;

public class UserDaoJpa implements UserDao<UserrEntity> {


    @Override
    public List<UserrEntity> findAll() {
        return null;
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