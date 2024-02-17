package com.example.tryspringboot.dao;

import com.example.tryspringboot.model.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author 文杰
 */
@Repository
public interface UserDao {
    /**
     * 根据id删除用户
     * @param id 用户id
     * @return 删除的行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入用户
     * @param record 用户
     * @return 插入的行数
     */
    int insert(User record);

    /**
     * 选择性插入用户
     * @param record 用户
     * @return 插入的行数
     */
    int insertSelective(User record);

    /**
     * 根据id查询用户
     * @param id 用户id
     * @return 用户
     */
    User selectByPrimaryKey(Long id);

    /**
     * 选择性更新用户
     * @param record 用户
     * @return 更新的行数
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新用户
     * @param record 用户
     * @return 更新的行数
     */
    int updateByPrimaryKey(User record);

    /**
     * 根据account查询用户
     * @param account 用户账号
     * @return 用户
     */
    User selectByAccount(String account);
}