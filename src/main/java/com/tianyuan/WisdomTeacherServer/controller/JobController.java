package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.SchoolJob;
import com.tianyuan.WisdomTeacherServer.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    @RequestMapping(value = "/searchjob",method = RequestMethod.GET)
    public SchoolJob seach(){
        SchoolJob schoolJob = jobService.searchJob();
        return schoolJob;
    }

    @RequestMapping(value ="/insertjob",method = RequestMethod.POST)
    public boolean insert(SchoolJob schoolJob) {
        boolean b= jobService.insertJob(schoolJob);
        return b;
    }

    @RequestMapping(value ="/editjob",method = RequestMethod.POST)
    public boolean edit(SchoolJob schoolJob){
        boolean b = jobService.updateJob(schoolJob);
        return b;
    }

    @RequestMapping(value ="/deletejob",method = RequestMethod.POST)
    public  boolean delete(Integer id) {
        boolean b = jobService.deleteJob(id);
        return b ;
    }
}
