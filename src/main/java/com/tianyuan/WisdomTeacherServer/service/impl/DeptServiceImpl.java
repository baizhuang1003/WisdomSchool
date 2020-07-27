package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDept;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolDeptMapper;
import com.tianyuan.WisdomTeacherServer.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private SchoolDeptMapper schoolDeptMapper;
    public SchoolDept searchDept(){
        SchoolDept schoolDept = schoolDeptMapper.selectByPrimaryKey(1);
        return schoolDept;
    }

    public boolean insertDept(SchoolDept schoolDept) {
        int count = schoolDeptMapper.insert(schoolDept);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateDept(SchoolDept schoolDept) {
        int count = schoolDeptMapper.updateByPrimaryKeySelective(schoolDept);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean deleteDept(Integer id) {
        int count = schoolDeptMapper.deleteByPrimaryKey(id);
        if (count > 0 ){
            return  true;
        }else {
            return false;
        }
    }
}
