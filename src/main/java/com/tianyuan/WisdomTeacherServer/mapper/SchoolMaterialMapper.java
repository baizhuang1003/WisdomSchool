package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolMaterial;

public interface SchoolMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolMaterial record);

    int insertSelective(SchoolMaterial record);

    SchoolMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolMaterial record);

    int updateByPrimaryKey(SchoolMaterial record);
}