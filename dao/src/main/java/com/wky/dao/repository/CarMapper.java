package com.wky.dao.repository;

import com.wky.dao.entity.Car;

public interface CarMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(Car record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(Car record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    Car selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(Car record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(Car record);
}