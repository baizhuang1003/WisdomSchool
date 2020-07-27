package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;

public interface SchoolClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolClass record);

    int insertSelective(SchoolClass record);

    SchoolClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolClass record);

    int updateByPrimaryKey(SchoolClass record);
}