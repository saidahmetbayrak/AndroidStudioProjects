package com.example.saidahmetbayrak.javalearn;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main (String[] args){

        //Array tanımlama

        String[] myArray = new String[4];

        myArray[0] = "Ahmet";
        myArray[1] = "Said";
        myArray[2] = "Bayrak";
        myArray[3] = "Merve";

        System.out.println(myArray[3]);

        int[] myNumberArray ={10,20,30,40,50};

        System.out.println(myNumberArray[3]);

        //List (Genellikle bu kullanılır)

        ArrayList<String> myMusician = new ArrayList<String>();
        myMusician.add("Ahmet");
        myMusician.add("Said");
        myMusician.add(1,"Bayrak");
        myMusician.add("Merve");

        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));
        System.out.println(myMusician.get(3));

        //Set(Kullancı adında genellede kullanılır)

        HashSet<String> mySet = new HashSet<String>();
        mySet.add("Ahmet");
        mySet.add("Ahmet");

        System.out.println(mySet.size());

        //Map (Data çekme durumunda yardımcı olacak)

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "Ahmet");
        myHashMap.put("ınstrument", "Guitar");

        System.out.println(myHashMap.get("ınstrument"));



    }
}

