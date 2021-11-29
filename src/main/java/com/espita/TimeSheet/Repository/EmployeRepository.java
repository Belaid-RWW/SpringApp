package com.espita.TimeSheet.Repository;

import com.espita.TimeSheet.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {
}
