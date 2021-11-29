package com.espita.TimeSheet.Controller;

import com.espita.TimeSheet.entities.Employe;
import com.espita.TimeSheet.services.EmployeService;
import com.espita.TimeSheet.services.Impl.EmployeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employe")
public class EmployeController {

    @Autowired
    EmployeService employeService;

    @PostMapping("/ajouterEmp")
    public void ajouterEmploye(@RequestBody Employe employe){
        employeService.ajouterEmploye(employe);
    }

}
