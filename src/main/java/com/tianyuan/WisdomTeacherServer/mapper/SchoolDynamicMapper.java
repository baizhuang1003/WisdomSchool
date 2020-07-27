package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDynamic;

public interface SchoolDynamicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolDynamic record);

    int insertSelective(SchoolDynamic record);

    SchoolDynamic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolDynamic record);

    int updateByPrimaryKey(SchoolDynamic record);
}