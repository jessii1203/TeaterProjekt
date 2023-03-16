package com.example.teaterprojekt.Controller;

import com.example.teaterprojekt.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ManagerRestController {

    @Autowired
    ManagerRepository managerRepository;



}
