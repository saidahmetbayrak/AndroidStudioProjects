package com.example.saidahmetbayrak.javalearn;

/**
 * Created by saidahmetbayrak on 4.12.2017.
 */

public class Variables {

    //pswm ile kısa yol ile yazılır
    public static void main(String[] args){

        //sout ile kisa yol ile yazılır
        //System.out.println();

        //integer -int(Tam sayı degerleri aliır)
        int x = 5;
        int y = 4;

        int age = 19;
        int sonuc = age * 4 / 3;
        System.out.println(sonuc);

        //Double -Float(Ondalık sayı degerleri alır)

        double pi = 3.14;
        double r = 5.0;
        System.out.println(2*pi*r);

        double a = 19.0;
        System.out.println(a*4/3);

        float z = 3.0f;



        //String (Textlerin kullanımı için kullanılır)

        String name = "Ahmet";
        String surname = "Bayrak";

        String fullname = name +" "+ surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        //Boolean(dogru yalniş degerler dondurur)

        boolean isAlive = true;
        isAlive =false;
        System.out.println(isAlive);



    }
}
