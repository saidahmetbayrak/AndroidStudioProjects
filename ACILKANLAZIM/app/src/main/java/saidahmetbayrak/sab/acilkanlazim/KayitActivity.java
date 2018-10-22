package saidahmetbayrak.sab.acilkanlazim;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

public class KayitActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    TextView adTextView,mailTextView,dateTextView,sifreTextView,kanTextView,cepTextView;
    EditText adEditText,mailEditText,dateEditText,sifreEditText,cepEditText;
    CheckBox onay;
    Button bilgiBtn,kayıtBtn;
    private FirebaseAuth auth;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);

        adTextView = findViewById(R.id.textViewAd);
        mailTextView = findViewById(R.id.textViewEmail);
        dateTextView = findViewById(R.id.textViewDate);
        sifreTextView = findViewById(R.id.textViewSifre);
        kanTextView = findViewById(R.id.textViewKan);
        cepTextView = findViewById(R.id.textViewCep);
        adEditText = findViewById(R.id.editTextAd);
        mailEditText = findViewById(R.id.editTextPosta);
        dateEditText = findViewById(R.id.editTextDate);
        sifreEditText = findViewById(R.id.editTextSifre);
        cepEditText = findViewById(R.id.editTextCep);
        onay = findViewById(R.id.checkBox);
        bilgiBtn = findViewById(R.id.btnBilgi);
        kayıtBtn = findViewById(R.id.btnKayitOl);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();


        kayıtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adSoyad = adEditText.getText().toString();
                String email = mailEditText.getText().toString();
                String parola = sifreEditText.getText().toString();
                String cepNo = cepEditText.getText().toString();
                String kanGrubu = spinner.getSelectedItem().toString();

                if(TextUtils.isEmpty(kanGrubu)){
                    Toast.makeText(getApplicationContext(),"Lütfen Kan Grubunuzu giriniz",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(adSoyad)){
                    Toast.makeText(getApplicationContext(),"Lütfen Adınız ve Soyadınızı giriniz",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(),"Lütfen Emailinizi giriniz",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(parola)){
                    Toast.makeText(getApplicationContext(),"Lütfen Parolanızı giriniz",Toast.LENGTH_SHORT).show();
                }
                if(TextUtils.isEmpty(cepNo)){
                    Toast.makeText(getApplicationContext(),"Lütfen Cep Numaranızı giriniz",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (parola.length()<6){
                    Toast.makeText(getApplicationContext(),"Parola en az 6 haneli olmalıdır",Toast.LENGTH_SHORT).show();
                }





                //FirebaseAuth ile email,parola parametrelerini kullanarak yeni bir kullanıcı oluşturuyoruz.
                auth.createUserWithEmailAndPassword(email,parola)
                        .addOnCompleteListener(KayitActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                //İşlem başarısız olursa kullanıcıya bir Toast mesajıyla bildiriyoruz.
                                if (!task.isSuccessful()) {
                                    Toast.makeText(KayitActivity.this, "Yetkilendirme Hatası",
                                            Toast.LENGTH_SHORT).show();
                                }

                                //İşlem başarılı olduğu takdir de giriş yapılıp MainActivity e yönlendiriyoruz.
                                else {
                                    startActivity(new Intent(KayitActivity.this, LoginActivity.class));
                                    finish();
                                }

                            }
                        });
            }
        });






      spinner =  findViewById(R.id.spinnerKan);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Kan Grubunu Seciniz");
        categories.add("A RH(+)");
        categories.add("A RH(-)");
        categories.add("B RH(+)");
        categories.add("B RH(-)");
        categories.add("AB RH(+)");
        categories.add("AB RH(-)");
        categories.add("O RH(+)");
        categories.add("O RH(-)");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Kan Grubu: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }




}

