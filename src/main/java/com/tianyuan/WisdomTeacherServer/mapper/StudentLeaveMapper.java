package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.StudentLeave;

import java.util.List;

public interface StudentLeaveMapper {


    /**
     *  查询所有的学生
     * @return
     */
    List<StudentLeave> findAll();

    /**
     *  根据学生id删除
     * @param id
     * @return
     */
    void deleteByPrimaryKey(String id);

    /**
     *  添加学生
     * @param record
     */
    void  insert(StudentLeave record);

    /**
     *  插入学生
     * @param record
     */
    void insertSelective(StudentLeave record);

    /**
     *  按照主键查询学生
     * @param id
     * @return
     */
    StudentLeave selectByPrimaryKey(String id);

    /**
     * 通过住建进行选择更新
     * @param record
     * @return
     */
    void updateByPrimaryKeySelective(StudentLeave record);

    /**
     *  通过主键进行更新
     * @param record
     */
    void updateByPrimaryKey(StudentLeave record);

}