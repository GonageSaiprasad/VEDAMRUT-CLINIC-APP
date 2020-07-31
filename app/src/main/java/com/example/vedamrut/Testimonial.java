package com.example.vedamrut;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class Testimonial extends AppCompatActivity {


    ViewFlipper v_flipper;
    int[] imageos={
            R.drawable.aa,
            R.drawable.bb,
            R.drawable.cc,
            R.drawable.dd,
            R.drawable.ee,
            R.drawable.ff,
            R.drawable.hh,
            R.drawable.ii,
            R.drawable.jj,
            R.drawable.kk,
            R.drawable.ll,
            R.drawable.mm,
            R.drawable.nn,
            R.drawable.pp,
            R.drawable.qq,
            R.drawable.rr,
            R.drawable.ss,
            R.drawable.tt,
            R.drawable.uu,
            R.drawable.vv,
            R.drawable.ww,
            R.drawable.xx,
            R.drawable.yy,
            R.drawable.zz,
            R.drawable.bbb,
            R.drawable.zzz


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testimonial);

        v_flipper=findViewById(R.id.flipper);
        for (int i=0;i<imageos.length;i++){
            flip_image(imageos[i]);
        }
    }
    public void flip_image(int i){
        ImageView view=new ImageView(this);
        view.setBackgroundResource(i);
        v_flipper.addView(view);
        v_flipper.setFlipInterval(9000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);
        v_flipper.setOutAnimation(this,android.R.anim.slide_in_left);
    }
}
