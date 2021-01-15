package com.example.methods;

public class movies {
     private int movie_id,  genre;
        private String movie_title, video_release_date, imdb_url, release_date;

        public movies(int movie_id, String movie_title, String release_date, String video_release_date,
                      String imdb_url, int genre ) {
            this.movie_id = movie_id;
            this.movie_title = movie_title;
            this.release_date = release_date;
            this.video_release_date = video_release_date;
            this.imdb_url = imdb_url;
            this.genre=genre;
        }

       }

