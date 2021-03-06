package com.springinaction.concert;

import org.aspectj.lang.annotation.*;

/**
 * Created by iancu_000 on 30-Nov-15.
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

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
