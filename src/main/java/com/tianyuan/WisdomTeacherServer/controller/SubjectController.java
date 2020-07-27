package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


}
