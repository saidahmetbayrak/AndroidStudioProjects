package saidahmetbayrak.sab.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void changeActivity(View view){


        userInput = findViewById(R.id.editText);

        // sayfalar arası geçiş yapmayı sağlar
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

        //gerilen degeri alın içindeki okuyup string e ceviriyor.
        intent.putExtra("input", userInput.getText().toString());

        startActivity(intent);


    }
}
