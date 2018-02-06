package com.example.pink24.myapplication3;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


    private MediaPlayer mediaplayer;

    @Override
    public void onCreate() {
        super.onCreate();
        mediaplayer=MediaPlayer.create(getBaseContext(), R.raw.sound);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaplayer.start();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaplayer.stop();
    }
}
