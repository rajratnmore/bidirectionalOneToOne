package com.geekster.bidirectionalOneToOne.service;

import com.geekster.bidirectionalOneToOne.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    IEmpRepo empRepo;
}
