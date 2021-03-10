package com.berthms.backend.repository;

import com.berthms.backend.entity.Vessel;
import com.berthms.backend.entity.VesselID;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@EnableJpaRepositories
public interface VesselRepository extends JpaRepository<Vessel, VesselID> {
    
    List<Vessel> findByStatus(String status);
}
