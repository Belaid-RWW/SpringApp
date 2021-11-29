package com.espita.TimeSheet.services;

import com.espita.TimeSheet.entities.Contrat;
import com.espita.TimeSheet.entities.Employe;

import java.util.List;

public interface EmployeService {

    public int ajouterEmploye(Employe employe);

    public void affecterEmployeADepartement(int employeId , int depId);

    public int ajouterContrat (Contrat contrat);

    public void affecterContratAEmploye(int contratId , int employeId);

    public String getEmployePrenomById(int employeId);

    public long getNombreEmployeJPQL();

    public List<String> getAllEmployeNamesJPQL();

    public void deleteEmploye(int employeId);


}
