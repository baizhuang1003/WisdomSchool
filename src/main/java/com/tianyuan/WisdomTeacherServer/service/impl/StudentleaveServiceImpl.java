package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.StudentLeave;
import com.tianyuan.WisdomTeacherServer.mapper.StudentLeaveMapper;
import com.tianyuan.WisdomTeacherServer.service.StudentleaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentleaveServiceImpl implements StudentleaveService {

    @Autowired
    private StudentLeaveMapper studentLeaveMapper;


    @Override
    public List<StudentLeave> findAll() {
        return studentLeaveMapper.findAll();
    }

    @Override
    public void deleteByPrimaryKey(String id) {
        studentLeaveMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(StudentLeave record) {
            studentLeaveMapper.insert(record);
    }

    @Override
    public void insertSelective(StudentLeave record) {
            studentLeaveMapper.insertSelective(record);
    }

    @Override
    public StudentLeave selectByPrimaryKey(String id) {
        return  studentLeaveMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(StudentLeave record) {
        studentLeaveMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void updateByPrimaryKey(StudentLeave record) {
            studentLeaveMapper.updateByPrimaryKey(record);
    }

    @Override
    public void importStudentLeave(List<StudentLeave> studentList) {

        if (studentList != null ){
            for (StudentLeave record : studentList) {
                studentLeaveMapper.insertSelective(record);
            }
        }
    }
}
