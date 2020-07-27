package com.tianyuan.WisdomTeacherServer.service.impl;


import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolSubjectMapper;
import com.tianyuan.WisdomTeacherServer.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SchoolSubjectMapper schoolSubjectMapper;


    @Override
    public SchoolSubject serchSubject() {
        SchoolSubject schoolSubject = schoolSubjectMapper.selectByPrimaryKey(1);
        return schoolSubject;
    }

    @Override
    public boolean insertSubject(SchoolSubject schoolSubject) {
        int count = schoolSubjectMapper.insertSelective(schoolSubject);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateSubject(SchoolSubject schoolSubject) {
        int count =schoolSubjectMapper.updateByPrimaryKeySelective(schoolSubject);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteSubject(Integer id) {
        int count = schoolSubjectMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}
