package com.espita.TimeSheet.services.Impl;

import com.espita.TimeSheet.Repository.ContratRepository;
import com.espita.TimeSheet.Repository.EmployeRepository;
import com.espita.TimeSheet.entities.Contrat;
import com.espita.TimeSheet.entities.Employe;
import com.espita.TimeSheet.services.EmployeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    EmployeRepository employeRepository;

    @Autowired
    ContratRepository contratRepository;

    @Override
    public int ajouterEmploye(Employe employe) {
        return employeRepository.save(employe).getId();
    }

    @Override
    public void affecterEmployeADepartement(int employeId, int depId) {

    }

    @Override
    public int ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat).getReference();
    }

    @Override
    public void affecterContratAEmploye(int contratId, int employeId) {

    }

    @Override
    public String getEmployePrenomById(int employeId) {
        return null;
    }

    @Override
    public long getNombreEmployeJPQL() {
        return 0;
    }

    @Override
    public List<String> getAllEmployeNamesJPQL() {
        return null;
    }

    @Override
    public void deleteEmploye(int employeId) {
        Employe emp = employeRepository.getById(employeId);
        employeRepository.delete(emp);
        // ou bien: employeRepository.deleteById(employeId);

    }
}
