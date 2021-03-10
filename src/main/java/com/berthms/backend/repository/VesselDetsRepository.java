package com.berthms.backend.repository;

import java.util.List;
import com.berthms.backend.entity.VesselDets;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

@EnableJpaRepositories
public interface VesselDetsRepository extends JpaRepository<VesselDets, Long> {

    @Query("select u from VesselDets u where u.VESSEL_NAME = ?1 and u.VOYAGE_CODE_INBOUND = ?2")
    VesselDets findByVesselNameandInVoyNo(String fullVslM , String inVoyN);

    @Query("select u from VesselDets u where u.VSL_VOY = ?1")
    VesselDets findByVesselNameandInVoyNo(String vslVoy);

    
}


