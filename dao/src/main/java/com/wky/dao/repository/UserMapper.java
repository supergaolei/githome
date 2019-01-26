package com.wky.dao.repository;

import com.wky.dao.entity.User;

public interface UserMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    User selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(User record);
}