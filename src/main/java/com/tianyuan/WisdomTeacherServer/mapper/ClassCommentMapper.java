package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.ClassComment;

public interface ClassCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassComment record);

    int insertSelective(ClassComment record);

    ClassComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassComment record);

    int updateByPrimaryKey(ClassComment record);
}