package com.example.activityhelperasutility;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityHelper {

    public static void ShowMessage(Context context, TextView tv, String message) {
        if(tv != null && message != null && message.length() > 0)
            tv.append(message + "\n");
        else
            tv.setText(message);

        Log.d(context.getClass().getSimpleName(), message);

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}