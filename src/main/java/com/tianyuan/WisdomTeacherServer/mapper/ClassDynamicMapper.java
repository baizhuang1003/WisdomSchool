package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.ClassDynamic;

public interface ClassDynamicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassDynamic record);

    int insertSelective(ClassDynamic record);

    ClassDynamic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassDynamic record);

    int updateByPrimaryKey(ClassDynamic record);
}