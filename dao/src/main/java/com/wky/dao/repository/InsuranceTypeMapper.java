package com.wky.dao.repository;

import com.wky.dao.entity.InsuranceType;

public interface InsuranceTypeMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(InsuranceType record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(InsuranceType record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    InsuranceType selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(InsuranceType record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(InsuranceType record);
}