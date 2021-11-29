package com.espita.TimeSheet.services;

import com.espita.TimeSheet.entities.Departement;
import com.espita.TimeSheet.entities.Entreprise;

import java.util.List;

public interface EntrepriseService {

    public int ajouterEntreprise (Entreprise entreprise);

    public int ajouterDepartement (Departement departement);

    void affecterDepartementAEntreprise(int depId , int entrepriseId);

    List<String> getAllDepartementsNamesByEntreprise (int entrepriseId);

}
