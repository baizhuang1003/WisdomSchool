package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolClassMapper;
import com.tianyuan.WisdomTeacherServer.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private SchoolClassMapper schoolClassMapper;

    public SchoolClass searchClass(){
        SchoolClass schoolClass = schoolClassMapper.selectByPrimaryKey(1);
        return  schoolClass;
    }
    public boolean insertClass(SchoolClass schoolClass){
        int count = schoolClassMapper.insert(schoolClass);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateClass(SchoolClass schoolClass){
        int count = schoolClassMapper.updateByPrimaryKeySelective(schoolClass);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteClass(Integer id){
        int count = schoolClassMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}
