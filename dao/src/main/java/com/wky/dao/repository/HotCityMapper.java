package com.wky.dao.repository;

import com.wky.dao.entity.HotCity;

public interface HotCityMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(HotCity record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(HotCity record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    HotCity selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(HotCity record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(HotCity record);
}