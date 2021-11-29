package com.espita.TimeSheet.Repository;

import com.espita.TimeSheet.entities.Timesheet;
import com.espita.TimeSheet.entities.TimesheetPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetRepository extends JpaRepository<Timesheet, Integer> {
}
