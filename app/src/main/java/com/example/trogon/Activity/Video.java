package com.example.trogon.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.trogon.R;

public class Video extends AppCompatActivity {

    VideoView vide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);


        vide=findViewById(R.id.videoView);

        String url ="https://player.vimeo.com/external/478328836.sd.mp4?s=2f3f0a9eb12d5099bb1e4e93e75ddf3a8c72b766&profile_id=164";
        Uri uri= Uri.parse(url);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vide);
        vide.setMediaController(mediaController);
        vide.setVideoPath(url);



    }

}