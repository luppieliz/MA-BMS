package com.berthms.backend.repository;

import com.berthms.backend.entity.Vessel;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@EnableJpaRepositories
public interface VesselRepository extends JpaRepository<Vessel, Long> {
    
    @Query("select u from Vessel u where u.status =?1 ")
    List<Vessel> findByStatus(String status); 
    
    @Query("select u from Vessel u where u.abbrVslM = ?1 and u.inVoyN = ?2")
    Vessel findByAbbrVslMandinVoyN(String abbrVslM , String inVoyN);

//     @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
//   User findByLastnameOrFirstname(@Param("lastname") String lastname,
//                                  @Param("firstname") String firstname);

    @Query("SELECT m FROM Vessel m WHERE m.fullVslM LIKE '%:date%'")
    List<Vessel> searchByDateLike(@Param("date") String date);
}
