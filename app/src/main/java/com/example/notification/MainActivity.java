package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.notification.services.createChannel;

public class MainActivity extends AppCompatActivity {

    NotificationManagerCompat notificationManagerCompat;
    Button notification1,notification2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notification1 = findViewById(R.id.button);
        notification2 = findViewById(R.id.button2);
        notificationManagerCompat = NotificationManagerCompat.from(this);
        notification1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationchannelone();
            }
        });

        notification2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationchanneltwo();
            }
        }));
    }

    public void notificationchannelone(){
        Notification notification = new NotificationCompat.Builder(this, createChannel.Channel_One)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Dokan")
                .setContentText("ads")
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManagerCompat.notify(1,notification);
    }

    public void notificationchanneltwo(){
        Notification notification = new NotificationCompat.Builder(this, createChannel.Channel_One)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Dokan")
                .setContentText("getete")
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManagerCompat.notify(1,notification);

    }


}
