package com.espita.TimeSheet.services.Impl;

import com.espita.TimeSheet.Repository.DepartementRepository;
import com.espita.TimeSheet.Repository.EntrepriseRepository;
import com.espita.TimeSheet.entities.Departement;
import com.espita.TimeSheet.entities.Entreprise;
import com.espita.TimeSheet.services.EntrepriseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EntrepriseServiceImpl implements EntrepriseService {

    @Autowired
    EntrepriseRepository entrepriseRepository;

    DepartementRepository departementRepository;

    @Override
    public int ajouterEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise).getId();
    }

    @Override
    public int ajouterDepartement(Departement departement) {
        return departementRepository.save(departement).getId();
    }

    @Override
    public void affecterDepartementAEntreprise(int depId, int entrepriseId) {

    }

    @Override
    public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
        return null;
    }
}
