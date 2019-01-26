package com.wky.dao.repository;

import com.wky.dao.entity.Level;

public interface LevelMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(Level record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(Level record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    Level selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(Level record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(Level record);
}