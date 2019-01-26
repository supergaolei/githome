package com.wky.dao.repository;

import com.wky.dao.entity.LicensePlateAssignment;

public interface LicensePlateAssignmentMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(LicensePlateAssignment record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(LicensePlateAssignment record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    LicensePlateAssignment selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(LicensePlateAssignment record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(LicensePlateAssignment record);
}