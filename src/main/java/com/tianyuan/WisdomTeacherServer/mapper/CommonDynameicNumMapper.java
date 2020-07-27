package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.CommonDynameicNum;

public interface CommonDynameicNumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonDynameicNum record);

    int insertSelective(CommonDynameicNum record);

    CommonDynameicNum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonDynameicNum record);

    int updateByPrimaryKey(CommonDynameicNum record);
}