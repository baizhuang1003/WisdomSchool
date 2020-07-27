package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolInfo;

public interface SchoolInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolInfo record);

    int insertSelective(SchoolInfo record);

    SchoolInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolInfo record);

    int updateByPrimaryKey(SchoolInfo record);
}