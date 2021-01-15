package com.example.methods;

public class Genre {
    private int genre_id;
    private String genre_name;

    public Genre(String genre_name ,int genre_id  )
    {
        this.genre_name = genre_name;
        this.genre_id = genre_id;
    }

    public void Genre(String genre_name) {
        this.genre_name = genre_name;
    }

    public String getGenre() {
        return genre_name;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public int getGenre_id() {
        return genre_id;
    }


}
