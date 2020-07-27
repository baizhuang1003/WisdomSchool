package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.ClassCommentHits;

public interface ClassCommentHitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassCommentHits record);

    int insertSelective(ClassCommentHits record);

    ClassCommentHits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassCommentHits record);

    int updateByPrimaryKey(ClassCommentHits record);
}