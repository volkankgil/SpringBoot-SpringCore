package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //marks the class component anonation as spring bean makes it avaible for dependecy injection
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) her bir değişken için ayrı instance oluşurulluyor.
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor:" +getClass().getSimpleName());
    }

    //define our init method

    /*@PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }*/

    //define our destroy method
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 50 minutes!";
    }
}
