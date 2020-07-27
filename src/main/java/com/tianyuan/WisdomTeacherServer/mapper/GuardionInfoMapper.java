package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.GuardionInfo;

public interface GuardionInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GuardionInfo record);

    int insertSelective(GuardionInfo record);

    GuardionInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GuardionInfo record);

    int updateByPrimaryKey(GuardionInfo record);
}