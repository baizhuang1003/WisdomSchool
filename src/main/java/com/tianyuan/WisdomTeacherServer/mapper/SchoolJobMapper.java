package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolJob;

public interface SchoolJobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolJob record);

    int insertSelective(SchoolJob record);

    SchoolJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolJob record);

    int updateByPrimaryKey(SchoolJob record);
}