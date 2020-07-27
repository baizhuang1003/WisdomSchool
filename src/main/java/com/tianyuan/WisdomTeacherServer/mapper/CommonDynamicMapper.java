package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.CommonDynamic;

public interface CommonDynamicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonDynamic record);

    int insertSelective(CommonDynamic record);

    CommonDynamic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonDynamic record);

    int updateByPrimaryKey(CommonDynamic record);
}