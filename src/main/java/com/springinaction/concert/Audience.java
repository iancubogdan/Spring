package com.springinaction.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Bogdan on 11/24/2015.
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.springinaction.concert.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }
}
