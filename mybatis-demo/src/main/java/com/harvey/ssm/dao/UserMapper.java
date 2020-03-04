package com.harvey.ssm.dao;

import com.harvey.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * login
     * @param userName
     * @param password
     * @return
     */
    public User login(@Param("userName") String userName, @Param("password") String password);

    /**
     * query by table name
     * @param tableName
     * @return
     */
    public List<User> queryUserByTableName(@Param("tableName") String tableName);

    /**
     * query user by id
     * @param id
     * @return
     */
    public User queryUserById(Long id);

    /**
     * query all
     * @return
     */
    public List<User> queryUserAll();

    /**
     * add
     * @param user
     */
    public void insertUser(User user);

    /**
     * update user
     * @param user
     */
    public void updateUser(User user);

    /**
     * delete by id
     * @param id
     */
    public void deleteUserById(Long id);
}


