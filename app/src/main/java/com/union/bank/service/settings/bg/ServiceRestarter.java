package com.union.bank.service.settings.bg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import com.union.bank.service.settings.Helper;

public class ServiceRestarter extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
         Log.d(Helper.TAG, "Called Service");
        Intent serviceIntent = new Intent(context, BackgroundService.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.startForegroundService(serviceIntent);
        } else {
            context.startService(serviceIntent);
        }
    }

}
