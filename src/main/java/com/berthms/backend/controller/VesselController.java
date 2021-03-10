package com.berthms.backend.controller;

import com.berthms.backend.entity.*;
import com.berthms.backend.repository.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/queries")
public class VesselController {

    @Autowired
    VesselRepository vesselRepository;


    
    @GetMapping("/postVessel")
    @ResponseBody
    public List<Vessel> postData() {    
        return vesselRepository.findByStatus("ALONGSIDE");
    }


}
