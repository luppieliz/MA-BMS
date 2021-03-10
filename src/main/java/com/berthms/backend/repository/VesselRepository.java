package com.berthms.backend.repository;

import com.berthms.backend.entity.Vessel;
import com.berthms.backend.entity.VesselID;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface VesselRepository extends JpaRepository<Vessel, VesselID> {
    
    List<Vessel> findByStatus(String status);
}
