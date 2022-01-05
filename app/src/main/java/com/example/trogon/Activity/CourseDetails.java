package com.example.trogon.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.trogon.R;

public class CourseDetails extends AppCompatActivity {


    TextView RealPrize, Title, enrol, rate, totalRate;
    ImageView img_thumb;
    ImageView video;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);


        RealPrize = findViewById(R.id.fullrate);
        Title = findViewById(R.id.title_pass);
        img_thumb = findViewById(R.id.imageofthumbils);
        enrol = findViewById(R.id.enroll);
        rate = findViewById(R.id.rate);
        totalRate = findViewById(R.id.correctrate);
        video = findViewById(R.id.videoUrl);

        RealPrize.setText(getIntent().getStringExtra("prize"));
        Glide.with(img_thumb.getContext()).load(getIntent().getStringExtra("image")).into(img_thumb);
        Title.setText(getIntent().getStringExtra("title"));
        enrol.setText(getIntent().getStringExtra("total"));
        rate.setText(getIntent().getStringExtra("rate1"));
        totalRate.setText(getIntent().getStringExtra("rate"));

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CourseDetails.this, Video.class);

                startActivity(intent);
            }
        });
    }
}