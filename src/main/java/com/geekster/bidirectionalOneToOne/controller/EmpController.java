package com.geekster.bidirectionalOneToOne.controller;

import com.geekster.bidirectionalOneToOne.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;


}
