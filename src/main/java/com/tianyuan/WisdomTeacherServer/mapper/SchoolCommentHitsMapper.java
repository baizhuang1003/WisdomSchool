package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolCommentHits;

public interface SchoolCommentHitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolCommentHits record);

    int insertSelective(SchoolCommentHits record);

    SchoolCommentHits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolCommentHits record);

    int updateByPrimaryKey(SchoolCommentHits record);
}