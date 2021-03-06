package com.espita.TimeSheet.entities;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class TimesheetPK implements Serializable {

    private int idEmploye;

    private int idMission;

    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @Temporal(TemporalType.DATE)
    private Date dateFin;

}
