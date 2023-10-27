package com.example.peliculasentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MovieDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        String json = getIntent().getStringExtra("movie");
        Gson gson = new Gson();
        Movie movie = gson.fromJson(json, Movie.class);
    }



}