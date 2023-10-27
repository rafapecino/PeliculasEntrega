package com.example.peliculasentrega;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

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
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 1"); // Puedes pasar datos adicionales a la actividad de detalles
                startActivity(intent);
            }
        });

        btnMovie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 2");
                startActivity(intent);
            }
        });
        btnMovie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 3");
                startActivity(intent);
            }
        });
        btnMovie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 4");
                startActivity(intent);
            }
        });
        btnMovie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 5");
                startActivity(intent);
            }
        });
        btnMovie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 6");
                startActivity(intent);
            }
        });
        btnMovie7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 7");
                startActivity(intent);
            }
        });
        btnMovie8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 8");
                startActivity(intent);
            }
        });
        btnMovie9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 9");
                startActivity(intent);
            }
        });
        btnMovie10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("movie_title", "Película 10");
                startActivity(intent);
            }
        });

    }
}
