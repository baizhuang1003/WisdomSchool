package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;
import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;
import com.tianyuan.WisdomTeacherServer.service.TermService;
import org.springframework.stereotype.Service;

@Service
public class TermServiceImpl implements TermService {
    @Override
    public SchoolTerm serchSubject() {
        return null;
    }

    @Override
    public boolean insert(SchoolSubject schoolSubject) {
        return false;
    }

    @Override
    public boolean updateJob(SchoolSubject schoolSubject) {
        return false;
    }

    @Override
    public boolean deleteJob(Integer id) {
        return false;
    }
    /*@Autowired
    private SchoolTerm*/
}
