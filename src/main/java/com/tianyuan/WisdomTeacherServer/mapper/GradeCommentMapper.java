package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.GradeComment;

public interface GradeCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GradeComment record);

    int insertSelective(GradeComment record);

    GradeComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GradeComment record);

    int updateByPrimaryKey(GradeComment record);
}