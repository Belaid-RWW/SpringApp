package com.espita.TimeSheet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Timesheet {

    @EmbeddedId
    private TimesheetPK timesheetPK;

    private boolean isValid;

    @ManyToOne
    private Employe employe;

    @ManyToOne
    private Mission mission;
}
