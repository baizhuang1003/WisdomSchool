package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDept;

public interface DeptService {
    //查询部门
    SchoolDept searchDept();

    //添加部门
    public boolean insertDept(SchoolDept schoolDept);

    //修改部门
    public boolean updateDept(SchoolDept schoolDept);

    //删除部门
    public boolean deleteDept(Integer id);

}
