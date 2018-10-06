package com.dator.claudette;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnActivity1){
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        } else if(v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/place/Hotel+Riffelalp,+3920+Zermatt,+Switzerland/@46.0020929,7.7489367,17z/data=!3m1!4b1!4m5!3m4!1s0x478f3594ee32c6ff:0x41d87d4b493493b0!8m2!3d46.0020929!4d7.7511254"));
            chooser = Intent.createChooser(i, "Select map app");
            startActivity(i);
        }
    }
}
