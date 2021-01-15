package com.example.methods;

public class Ratings {
    private int user_id, item_id, rating, timestamp;

    public Ratings(int user_id, int item_id, int rating, int timestamp) {
        this.user_id = user_id;
        this.item_id = item_id;
        this.rating = rating;
        this.timestamp = timestamp;
    }


    public int getUser_id() { return user_id; }
    public int getRating() { return rating; }
    public int getItem_id() { return item_id; }
    }