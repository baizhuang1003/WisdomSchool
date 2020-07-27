package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolStudent;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolStudentMapper;
import com.tianyuan.WisdomTeacherServer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private SchoolStudentMapper schoolStudentMapper;

    public SchoolStudent searchStudent() {
        SchoolStudent schoolStudent = schoolStudentMapper.selectByPrimaryKey(1);
        return schoolStudent;
    }

    public boolean updateStudent(SchoolStudent schoolStudent) {
        int count = schoolStudentMapper.updateByPrimaryKeySelective(schoolStudent);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public SchoolStudent searchStudent(String id) {
        SchoolStudent schoolStudent = schoolStudentMapper.selectByPrimaryKey(Integer.parseInt(id));
        return schoolStudent;
    }

    @Override
    public List<SchoolStudent> findAll() {
        List<SchoolStudent> all = schoolStudentMapper.findAll();
        return all;
    }

    @Override
    public Integer countItem() {
        Integer countItem = schoolStudentMapper.countItem();
        return countItem;
    }
}
