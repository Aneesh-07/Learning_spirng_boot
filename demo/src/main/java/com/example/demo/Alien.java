package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component

public class Alien {
    private int aid;
    private String aname;
    private String atech;
    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;



    
    


    public Alien() {
        System.out.println("Object Created");
    }
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getAtech() {
        return atech;
    }
    public void setAtech(String atech) {
        this.atech = atech;
    }



    public void show(){
        System.out.println("In show");
        laptop.compile();
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    
}
