package com.example.teaterprojekt.Controller;

import com.example.teaterprojekt.Model.Manager;
import com.example.teaterprojekt.Repository.ManagerRepository;
import com.example.teaterprojekt.Repository.MovieRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController //dette er con fortælle det
@CrossOrigin // for at fortælle at at vi har aggang til con gennem java Script
public class ManagerRestController {

    @Autowired
    ManagerRepository managerRepository;
    @GetMapping ("/manager")
    public List<Manager> manager(){return managerRepository.findAll();}

    @PostMapping("manage")
    @ResponseStatus(HttpStatus.CREATED)
    public Manager postManager(@RequestBody Manager manager){
        System.out.println(manager);
        return managerRepository.save(manager);
    }



}
