package com.example.peliculasentrega;

import java.util.List;

public class Movie {
    private String titulo;
    private String director;
    private List<String> actores;
    private String portada;

    public Movie(String titulo, String director, List<String> actores, String portada) {
        this.titulo = titulo;
        this.director = director;
        this.actores = actores;
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActores() {
        return actores;
    }

    public String getPortada() {
        return portada;
    }
}
