package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolJob;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolJobMapper;
import com.tianyuan.WisdomTeacherServer.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private SchoolJobMapper schoolJobMapper;

    @RequestMapping(value ="/searchjob",method = RequestMethod.GET)
    public SchoolJob searchJob(Integer id) {
        SchoolJob schoolJob = schoolJobMapper.selectByPrimaryKey(id);
        return schoolJob;
    }

    @Override
    public SchoolJob searchJob() {
        return null;
    }

    @RequestMapping(value ="/insertjob",method = RequestMethod.POST)
    public boolean insertJob(SchoolJob schoolJob) {
        int count = schoolJobMapper.insert(schoolJob);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateJob(SchoolJob schoolJob) {
        return false;
    }

    @RequestMapping(value ="/editjob",method = RequestMethod.POST)
    public boolean editJob(SchoolJob schoolJob) {
        int count = schoolJobMapper.updateByPrimaryKeySelective(schoolJob);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }

    @RequestMapping(value ="/deletejob",method = RequestMethod.POST)
    public boolean deleteJob(Integer id) {
        int count = schoolJobMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }
}
