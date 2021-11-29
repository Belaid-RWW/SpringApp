package com.espita.TimeSheet.Repository;

import com.espita.TimeSheet.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
}
