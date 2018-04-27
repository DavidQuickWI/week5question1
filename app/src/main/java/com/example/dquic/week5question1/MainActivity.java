package com.example.dquic.week5question1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    protected int[] images = {R.drawable.asd, R.drawable.asdf, R.drawable.asdfg};
    protected ImageView imgViewCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgViewCity = (ImageView)findViewById(R.id.citypic);
    }

    private void changeDublin(View view){
        imgViewCity.setImageResource(images[0]);
    }

    private void changeParis(View view){
        imgViewCity.setImageResource(images[1]);
    }

    private void changeLondon(View view){
        imgViewCity.setImageResource(images[2]);
    }
}
