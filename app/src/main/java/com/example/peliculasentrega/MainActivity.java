package com.example.peliculasentrega;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMovie1 = findViewById(R.id.btnMovie1);
        Button btnMovie2 = findViewById(R.id.btnMovie2);
        Button btnMovie3 = findViewById(R.id.btnMovie3);
        Button btnMovie4 = findViewById(R.id.btnMovie4);
        Button btnMovie5 = findViewById(R.id.btnMovie5);
        Button btnMovie6 = findViewById(R.id.btnMovie6);
        Button btnMovie7 = findViewById(R.id.btnMovie7);
        Button btnMovie8 = findViewById(R.id.btnMovie8);
        Button btnMovie9 = findViewById(R.id.btnMovie9);
        Button btnMovie10 = findViewById(R.id.btnMovie10);


        btnMovie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 1", "Director 1", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);
            }
        });
        btnMovie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 2", "Director 2", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);
            }
        });
        btnMovie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 3", "Director 3", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);
            }
        });
        btnMovie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 4", "Director 4", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);
            }
        });
        btnMovie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 5", "Director 5", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);
            }
        });
        btnMovie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 6", "Director 6", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);
            }
        });
        btnMovie7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 7", "Director 7", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);
            }
        });
        btnMovie8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 8", "Director 8", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);
            }
        });
        btnMovie9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 9", "Director 9", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);
                startActivity(intent);

            }
        });
        btnMovie10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie movie = new Movie("Película 10", "Director 10", null, null);
                Gson gson = new Gson();
                String json = gson.toJson(movie);
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie", json);

                startActivity(intent);
            }
        });
    }
}