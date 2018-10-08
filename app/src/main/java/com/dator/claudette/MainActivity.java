package com.dator.claudette;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4IT-H", "onCreate is running");
        Intent i = new Intent(this, ActivityService.class);
        startService(i);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITH", "OnStart has started...");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ITH", "OnResume has started...");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ITH", "OnStop has started...");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4ITH", "OnPause has started...");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4ITH", "OnRestart has started...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH", "OnDestroy has started...");
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnActivity2){
            i = new Intent(this,Activity2.class);
            startActivity(i);
        } else if(v.getId() == R.id.btnMap1){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:46.0204437,7.7431283?z=17"));
            chooser = Intent.createChooser(i, "Select map app");
            startActivity(chooser);
        }
    }
}
