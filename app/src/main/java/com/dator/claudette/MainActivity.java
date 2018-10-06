package com.dator.claudette;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnActivity2){
            i = new Intent(this,Activity2.class);
            startActivity(i);
        } else if(v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/place/Hotel+The+Omnia/@14.5884358,121.0113678,13z/data=!4m7!3m6!1s0x478f35df2141df13:0x10f4370d5ae3ad96!5m1!1s2018-10-14!8m2!3d46.02044!4d7.745317"));
            chooser = Intent.createChooser(i, "Select map app");
            startActivity(i);
        }
    }
}
