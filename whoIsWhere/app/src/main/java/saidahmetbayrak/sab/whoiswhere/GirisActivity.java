package saidahmetbayrak.sab.whoiswhere;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class GirisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        menuEkraninaGec();
    }

    private void menuEkraninaGec(){
        Animation amin = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        ImageView girisLogo = findViewById(R.id.imageViewGirisLogo);
        amin.reset();
        girisLogo.clearAnimation();
        girisLogo.startAnimation(amin);

    }
}
