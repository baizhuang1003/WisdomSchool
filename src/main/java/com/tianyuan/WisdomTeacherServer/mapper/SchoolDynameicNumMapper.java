package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDynameicNum;

public interface SchoolDynameicNumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolDynameicNum record);

    int insertSelective(SchoolDynameicNum record);

    SchoolDynameicNum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolDynameicNum record);

    int updateByPrimaryKey(SchoolDynameicNum record);
}