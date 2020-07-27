package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;
import com.tianyuan.WisdomTeacherServer.bean.SchoolFloorKey;

public interface SchoolFloorMapper {
    int deleteByPrimaryKey(SchoolFloorKey key);

    int insert(SchoolFloor record);

    int insertSelective(SchoolFloor record);

    SchoolFloor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolFloor record);

    int updateByPrimaryKey(SchoolFloor record);
}