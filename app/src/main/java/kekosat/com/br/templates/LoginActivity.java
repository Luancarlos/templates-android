package kekosat.com.br.templates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Calendar;

public class LoginActivity extends AppCompatActivity {

    ImageView imageView;
    boolean night = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageView = findViewById(R.id.background);

        // verify hours
        Calendar now = Calendar.getInstance();
        int currentHour = now.get(Calendar.HOUR_OF_DAY);
        if(currentHour > 18){
            imageView.setImageResource(R.drawable.background_night);
            night = true;
        }
        else{
            imageView.setImageResource(R.drawable.background_day);
            night = false;
        }
    }

    public void change_background(View view) {
        if(night){
            imageView.setImageResource(R.drawable.background_day);
            night = false;

        }
        else{

            imageView.setImageResource(R.drawable.background_night);
            night = true;
//            Animation fadeIn = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.fade_out);
//            imageView.startAnimation(fadeIn);
//
//            fadeIn.setAnimationListener(new Animation.AnimationListener() {
//                @Override
//                public void onAnimationStart(Animation animation) {
//                }
//                @Override
//                public void onAnimationEnd(Animation animation) {
//
//                }
//                @Override
//                public void onAnimationRepeat(Animation animation) {
//                }
//            });
        }


    }
}
