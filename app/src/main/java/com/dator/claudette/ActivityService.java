package com.dator.claudette;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class ActivityService extends IntentService{
    public ActivityService() {
        super("ActivityService");
    }


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITH", "Service is Running");
    }
}
