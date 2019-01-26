package com.wky.dao.repository;

import com.wky.dao.entity.Question;

public interface QuestionMapper {
    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int deleteByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insert(Question record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int insertSelective(Question record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    Question selectByPrimaryKey(Integer pkId);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKeySelective(Question record);

    /**
     *
     * @mbg.generated 2019-01-25 13:33:52
     */
    int updateByPrimaryKey(Question record);
}