package com.example.ezeenotification;

import android.content.Context;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotificationHelper {
    public static void displayNOtification(Context context,String title,String body){
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context,MainActivity.CHANNEL_ID)
                .setSmallIcon(R.drawable.ezee)
                .setContentTitle(title)
                .setContentText(body)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat mNotificationmgr = NotificationManagerCompat.from(context);
        mNotificationmgr.notify(1,mBuilder.build());

    }
}
