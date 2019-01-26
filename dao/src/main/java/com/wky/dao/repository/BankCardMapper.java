package com.wky.dao.repository;

import com.wky.dao.entity.BankCard;

public interface BankCardMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(BankCard record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(BankCard record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    BankCard selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(BankCard record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(BankCard record);
}