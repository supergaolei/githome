package com.wky.dao.repository;

import com.wky.dao.entity.InsuranceCompany;

public interface InsuranceCompanyMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(InsuranceCompany record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(InsuranceCompany record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    InsuranceCompany selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(InsuranceCompany record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(InsuranceCompany record);
}