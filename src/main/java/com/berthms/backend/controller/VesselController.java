package com.berthms.backend.controller;

import com.berthms.backend.entity.*;
import com.berthms.backend.repository.*;
import com.berthms.backend.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.*;

import com.google.gson.Gson;

import java.util.List;

@RestController
@RequestMapping("/queries")
public class VesselController {

    @Autowired
    VesselRepository vesselRepository;
    @Autowired
    VesselDetsRepository vesselDetsRepository;

    
    @GetMapping("/postVessel")
    @ResponseBody
    public List<Vessel> postData() {    
        return vesselRepository.findByStatus("ALONGSIDE");
    }


}
