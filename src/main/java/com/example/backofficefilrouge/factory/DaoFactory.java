package com.example.backofficefilrouge.factory;

import com.example.backofficefilrouge.Dao.UserDao;
import com.example.backofficefilrouge.Dao.UserDaoJpa;
import com.example.backofficefilrouge.entity.UserrEntity;

public class DaoFactory {

    private DaoFactory(){}

    public static UserDao<UserrEntity> getUserDao(){
        return new UserDaoJpa();
    }
}
