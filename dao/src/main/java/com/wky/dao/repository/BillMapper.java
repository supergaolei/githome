package com.wky.dao.repository;

import com.wky.dao.entity.Bill;

public interface BillMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(Bill record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(Bill record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    Bill selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(Bill record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(Bill record);
}