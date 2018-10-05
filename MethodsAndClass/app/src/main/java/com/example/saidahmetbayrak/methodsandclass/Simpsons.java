package com.example.saidahmetbayrak.methodsandclass;

/**
 * Created by saidahmetbayrak on 6.12.2017.
 */

public class Simpsons {

    private String name;
    private int age;
    private String occupation; //(meslek)

    public Simpsons(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

   }
