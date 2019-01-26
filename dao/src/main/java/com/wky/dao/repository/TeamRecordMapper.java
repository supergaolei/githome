package com.wky.dao.repository;

import com.wky.dao.entity.TeamRecord;

public interface TeamRecordMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(TeamRecord record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(TeamRecord record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    TeamRecord selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(TeamRecord record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(TeamRecord record);
}