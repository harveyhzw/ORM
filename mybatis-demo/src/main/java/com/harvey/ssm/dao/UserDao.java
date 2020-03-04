package com.harvey.ssm.dao;

import com.harvey.ssm.pojo.User;

import java.util.List;

public interface UserDao {

    /**
     * by Id
     *
     * @param id
     * @return
     */
    public User queryUserById(String id);

    /**
     * all
     *
     * @return
     */
    public List<User> queryUserAll();

    /**
     * add new
     *
     * @param user
     */
    public void insertUser(User user);

    /**
     * update
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * delete by id
     *
     * @param id
     */
    public void deleteUser(String id);
}
