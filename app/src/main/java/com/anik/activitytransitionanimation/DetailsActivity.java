package com.anik.activitytransitionanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateShrink(DetailsActivity.this); //fire the slide left animation
    }

//
//Animatoo.animateZoom(context);
//Animatoo.animateFade(context);
//Animatoo.animateWindmill(context);
//Animatoo.animateSpin(context);
//Animatoo.animateDiagonal(context);
//Animatoo.animateSplit(context);
//Animatoo.animateShrink(context);
//Animatoo.animateCard(context);
//Animatoo.animateInAndOut(context);
//Animatoo.animateSwipeLeft(context);
//Animatoo.animateSwipeRight(context);
//Animatoo.animateSlideLeft(context);
//Animatoo.animateSlideRight(context);
//Animatoo.animateSlideDown(context);
//Animatoo.animateSlideUp(context);

}
