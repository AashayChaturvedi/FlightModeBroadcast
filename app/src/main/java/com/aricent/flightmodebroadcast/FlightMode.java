package com.aricent.flightmodebroadcast;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class FlightMode extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean check = Settings.Global.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;

        if (!check) {
            Toast.makeText(context, "Airplane Mode off", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Airplane Mode on", Toast.LENGTH_SHORT).show();
        }
    }
}
