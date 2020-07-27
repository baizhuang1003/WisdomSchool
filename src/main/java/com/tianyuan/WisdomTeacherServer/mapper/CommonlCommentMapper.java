package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.CommonlComment;

public interface CommonlCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonlComment record);

    int insertSelective(CommonlComment record);

    CommonlComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonlComment record);

    int updateByPrimaryKey(CommonlComment record);
}