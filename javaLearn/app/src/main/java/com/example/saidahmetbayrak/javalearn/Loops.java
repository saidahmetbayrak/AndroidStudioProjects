package com.example.saidahmetbayrak.javalearn;

/**
 * Created by saidahmetbayrak on 6.12.2017.
 */

public class Loops {
    public static void main(String[] args){



        int[] myNumber = {12, 15, 18, 21, 24};

        int x = myNumber[0] /3 * 5;

        System.out.println(x);

        //for loop(genelde Array loop kullanılır)
        for (int i = 0; i < myNumber.length; i++){
            int y = myNumber[i] / 3 * 5;
            System.out.println(y);
        }

        //Bu genelde diziler için kullanılır
        for (int number : myNumber){
            int z = number / 3 * 5;
            System.out.println(z);
        }

        for (int a = 0; a < 10; a++){
            int b = a * 10;
            System.out.println(b);
        }

        //while loop

        int j = 0;
        while (j <10){
            int m = j * 10;
            System.out.println(m);
            j++;
        }
    }
}
