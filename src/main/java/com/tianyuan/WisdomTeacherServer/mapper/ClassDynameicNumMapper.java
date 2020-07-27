package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.ClassDynameicNum;

public interface ClassDynameicNumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassDynameicNum record);

    int insertSelective(ClassDynameicNum record);

    ClassDynameicNum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassDynameicNum record);

    int updateByPrimaryKey(ClassDynameicNum record);
}