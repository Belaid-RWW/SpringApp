package com.espita.TimeSheet.Repository;

import com.espita.TimeSheet.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}
