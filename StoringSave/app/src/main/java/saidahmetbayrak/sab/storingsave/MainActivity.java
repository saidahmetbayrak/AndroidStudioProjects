package saidahmetbayrak.sab.storingsave;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("saidahmetbayrak.sab.storingsave", Context.MODE_PRIVATE);

        int age= 40;

        sharedPreferences.edit().putInt("userAge", age).apply(); // burda girilen 40 degeri kaydetti

        int saveAge = sharedPreferences.getInt("userAge",0); // 40 degeri kaydedip etmediğini kontrol ediyor girmisse 40 yazar girmemişse 0 yazar

        System.out.println("saved value: " + saveAge);

        //GÜncelleme yapmak için tekrar yaptık

        age = 10;

        sharedPreferences.edit().putInt("userAge", age).apply();

        int saveAge2 = sharedPreferences.getInt("userAge",0);

        System.out.println("saved value: " +saveAge2);

        //silme için kullanılır


        sharedPreferences.edit().remove("userAge").apply();

        int saveAge3 = sharedPreferences.getInt("userAge",0);

        System.out.println("delete value: " + saveAge3);
    }
}
