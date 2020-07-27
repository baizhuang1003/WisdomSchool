package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.GradeCommentHits;

public interface GradeCommentHitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GradeCommentHits record);

    int insertSelective(GradeCommentHits record);

    GradeCommentHits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GradeCommentHits record);

    int updateByPrimaryKey(GradeCommentHits record);
}