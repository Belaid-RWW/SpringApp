package com.espita.TimeSheet.Repository;

import com.espita.TimeSheet.entities.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Integer> {
}
