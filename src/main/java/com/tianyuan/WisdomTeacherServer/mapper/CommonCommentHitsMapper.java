package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.CommonCommentHits;

public interface CommonCommentHitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonCommentHits record);

    int insertSelective(CommonCommentHits record);

    CommonCommentHits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonCommentHits record);

    int updateByPrimaryKey(CommonCommentHits record);
}