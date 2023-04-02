package com.example.instagramcloneloginregisterpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Story_view extends AppCompatActivity {

    private RecycleView storyBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_view);
    }

    private void init(){

        storyBar = findViewById(R.id.storyBarID);
    }
}