package com.espita.TimeSheet.services.Impl;

import com.espita.TimeSheet.Repository.MissionRepository;
import com.espita.TimeSheet.Repository.TimesheetRepository;
import com.espita.TimeSheet.entities.Mission;
import com.espita.TimeSheet.services.TimesheetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class TimesheetServiceImpl implements TimesheetService {

    @Autowired
    TimesheetRepository timesheetRepository;

    @Autowired
    MissionRepository missionRepository;

    @Override
    public int ajouterMission(Mission mission) {
        return missionRepository.save(mission).getId();
    }

    @Override
    public void affecterMissionADepartement(int missionId, int depId) {

    }

    @Override
    public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin) {

    }
}
