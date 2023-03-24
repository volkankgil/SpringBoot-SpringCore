package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy // lazy yazar isek inject yapmaz isek not initialized when we run application
//@Primary // if we write primary anotation spring run this class
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor:" +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a HARD 5K.";
    }
}
