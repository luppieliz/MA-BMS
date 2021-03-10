package com.berthms.backend.repository;

import java.util.List;
import com.berthms.backend.entity.VesselDets;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

@EnableJpaRepositories
public interface VesselDetsRepository extends JpaRepository<VesselDets, String> {

    VesselDets findByVSL_VOY(String vSL_VOY);
    
}


