package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolComment;

public interface SchoolCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolComment record);

    int insertSelective(SchoolComment record);

    SchoolComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolComment record);

    int updateByPrimaryKey(SchoolComment record);
}