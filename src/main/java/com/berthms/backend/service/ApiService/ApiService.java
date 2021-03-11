package com.berthms.backend.service.ApiService;

import com.berthms.backend.entity.*;
import com.berthms.backend.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.*;

import com.google.gson.Gson;

import java.util.List;
//scheduled
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RestController
@RequestMapping("/api")
public class ApiService {
	
	private static final Logger log = LoggerFactory.getLogger(ApiService.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	// @Scheduled(cron = "0 * * * * ?")
	// public void reportCurrentTime() {
	// 	log.info("{}: This is a minute message from apiService", dateFormat.format(new Date()));
    //     CurrentDateTime current = new CurrentDateTime();
    //     log.info("{\"dateFrom\": " + "\"" + current.currentDate() + "\""+  ", \"dateTo\":" + "\"" + current.oneWeek() + "\"}");
    // }

    @Autowired
    VesselRepository vesselRepository;
    @Autowired
    VesselDetsRepository vesselDetsRepository;

    @GetMapping("/getData")
    @ResponseBody
    public VesselDets getData(String line) {
        VesselDets vesseldets = null;

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
                vesseldets = gson.fromJson(response.toString(), VesselDets.class);
                

                return vesseldets;

            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (ProtocolException ex) {
            System.out.println("Invalid Protocol");
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }

        return vesseldets;
    }

    @GetMapping("/postData")
    @ResponseBody
    public List<Vessel> postData() {
        Output output = null;
        try {
            URL url = new URL("https://api.portnet.com/vsspp/pp/bizfn/berthingSchedule/retrieveByBerthingDate/v1.2");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // con.setRequestMethod("POST");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("Apikey", "8f765e3bf8534243bceeb5341a78f5f2");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);
            CurrentDateTime current = new CurrentDateTime();
            String jsonInputString = "{\"dateFrom\": " + "\"" + current.currentDate() + "\""+  ", \"dateTo\":" + "\"" + current.oneWeek() + "\"}";

            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                StringBuilder response = new StringBuilder();

                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                Gson gson = new Gson();
                output = gson.fromJson(response.toString(), Output.class);
                
                for(Vessel a: output.getResult()){
                    String vslVoy = (a.getFullVslM() + a.getInVoyN()).replace(" ", "");
                    String url2 = "https://api.portnet.com/extapi/vessels/predictedbtr/?vslvoy=" + vslVoy;
                    VesselDets vesselDets = this.getData(url2);
                    try {
                        vesselDetsRepository.save(vesselDets);
                    } catch (Exception e) {
                        log.warn("Vessel problem encountered");
                    }
                    Thread.sleep(300);
                    vesselRepository.save(a);
                }

                return output.getResult();

            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (ProtocolException ex) {
            System.out.println("Invalid Protocol");
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }

        return output.getResult();
    }

    
	// @Scheduled(cron = "0 36 17 * * ?")
	// public void scheduledPostData() {
    //     postData();
	// 	log.info("{}: Post data successfully ran.", dateFormat.format(new Date()));
    // }

}
