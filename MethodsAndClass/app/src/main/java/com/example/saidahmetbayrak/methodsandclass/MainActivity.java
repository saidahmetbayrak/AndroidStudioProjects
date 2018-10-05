package com.example.saidahmetbayrak.methodsandclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("application started");
        test();
        System.out.println(math(5,6));
        makeSimpsons();
        makeMusicians();

    }

    public void test() {
        int x = 4+4;
        System.out.println("value of x:" + x);

    }

    public int math(int a, int b){
        return a + b;

    }


    public void makeMusicians() {

        Musician ahmet = new Musician("Said Ahmet Bayrak", "guitar", 24);
    }


    public void makeSimpsons(){
        Simpsons said = new Simpsons("Ahmet",24,"Engineer");
        System.out.println(said.getName());
        said.setName("said ahmet bayrak");
        System.out.println(said.getName());
    }

}
