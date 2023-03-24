package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for dependency
    private Coach myCoach;

    //private Coach anotherCoach; //bean scopes için oluşturduk.

    //define a constructor for dependency injection
    /*@Autowired //autowired annotian tells Spring to inject a dependency - ıf you have one constructor write autowired annotation is optional
    public DemoController(@Qualifier("baseballCoach") Coach myCoach){  //4 adet coach olduğu için hangisinin çalışçağını bulmak için qualifier anatasyonunu kullanıyoruz. bean id class name'in küçük harfle başlayanıdır.
        this.myCoach=myCoach;
    }*/

    //define a setter injection for dependency injection
    /*@Autowired
    public void setCoach(Coach theCoach){
        myCoach=theCoach;
    }*/

    /*
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach myCoach) {
        System.out.println("In constructor:" +getClass().getSimpleName());
        this.myCoach = myCoach;
    }
     */

    @Autowired
    public DemoController(@Qualifier("swimCoach")Coach myCoach){
        System.out.println("In constructor:" +getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    /*@Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach myCoach,
            @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In constructor:" +getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach=anotherCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout () {
        return myCoach.getDailyWorkout();
        }

      /*  @GetMapping("/check")
    public String check(){
        return "Compating beans: myCoach == anotherCoach " +(myCoach==anotherCoach);//if the same bean check singleton its true, prototype false
        }*/
    }

