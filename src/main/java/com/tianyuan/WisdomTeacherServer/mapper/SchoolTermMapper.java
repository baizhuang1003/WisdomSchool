package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;

public interface SchoolTermMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolTerm record);

    int insertSelective(SchoolTerm record);

    SchoolTerm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolTerm record);

    int updateByPrimaryKey(SchoolTerm record);
}