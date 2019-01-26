package com.wky.dao.repository;

import com.wky.dao.entity.DeliveryAddress;

public interface DeliveryAddressMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(DeliveryAddress record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(DeliveryAddress record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    DeliveryAddress selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(DeliveryAddress record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(DeliveryAddress record);
}