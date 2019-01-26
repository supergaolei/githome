package com.wky.dao.repository;

import com.wky.dao.entity.Advertisement;

public interface AdvertisementMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(Advertisement record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(Advertisement record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    Advertisement selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(Advertisement record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(Advertisement record);
}