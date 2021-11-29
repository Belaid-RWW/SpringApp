package com.espita.TimeSheet.services;

import com.espita.TimeSheet.entities.Mission;

import java.util.Date;

public interface TimesheetService {

    public int ajouterMission (Mission mission);

    public void affecterMissionADepartement(int missionId , int depId);

    public void ajouterTimesheet(int missionId , int employeId , Date dateDebut , Date dateFin);
}
