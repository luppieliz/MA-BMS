package com.berthms.backend.service;

import java.time.LocalDate;


public class CurrentDateTime {

    public LocalDate currentDate(){
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public LocalDate oneWeek(){
        LocalDate localDate = LocalDate.now();
        LocalDate oneWeek = localDate.plusDays(6);
        return oneWeek;
    }


}