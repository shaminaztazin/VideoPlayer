package com.videoplayer.videoplayer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView video;
    MediaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video=findViewById(R.id.videoView);

        controller=new MediaController(this);
        video.setMediaController(controller);
       // video.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        video.setVideoURI(Uri.parse("android.resource://com.videoplayer.videoplayer/raw/video"));
        video.start();
    }
}
