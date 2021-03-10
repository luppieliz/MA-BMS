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

    @GetMapping("/postRecord")
    @ResponseBody
    public VesselDets getData() {
        return vesselDetsRepository.findByVesselNameandInVoyNo("NAVIOS DOMINO", "A1IN1N");
        // userRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    @GetMapping("/postVessel")
    @ResponseBody
    public List<Vessel> postData() {    
        return vesselRepository.findByStatus("ALONGSIDE");
    }

    @GetMapping("/postME")
    @ResponseBody
    public Vessel postYou() {
        System.out.println(vesselRepository.findByAbbrVslMandinVoyN("ABHIMATA 1", "B107B"));
    
        return vesselRepository.findByAbbrVslMandinVoyN("ABHIMATA 1", "B107B");

    }

    @GetMapping("/addME")
    @ResponseBody
    public void addYou() {
        
        List<Vessel> list = vesselRepository.findByStatus("ALONGSIDE");
        for(Vessel a: list){
            String vslVoy = (a.getFullVslM() + a.getInVoyN()).replace(" ", "");
            String url = "https://api.portnet.com/extapi/vessels/predictedbtr/?vslvoy=" + vslVoy;
            this.getData(url);
        }
        

    }

    public void getData(String line) {
		
        try {
            URL url = new URL(line);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("Apikey", "8f765e3bf8534243bceeb5341a78f5f2");

            try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                StringBuilder response = new StringBuilder();

                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                Gson gson = new Gson();
                VesselDets vesseldets = gson.fromJson(response.toString(), VesselDets.class);
                vesselDetsRepository.save(vesseldets);

                

            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (ProtocolException ex) {
            System.out.println("Invalid Protocol");
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }

    }
}
