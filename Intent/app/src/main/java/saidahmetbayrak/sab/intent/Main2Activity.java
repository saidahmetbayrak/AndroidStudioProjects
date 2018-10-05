package saidahmetbayrak.sab.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView2);

        Intent intent = getIntent();
        // alınan degeri main activity 2 de yazmayı sağlıyor
       String received = intent.getStringExtra("input");

       textView.setText(received); 
    }

    public void changeActivity(View view){

        // sayfalar arası geçiş yapmayı sağlar
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);


    }
}
