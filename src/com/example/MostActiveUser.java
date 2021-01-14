package com.example;

import com.example.Mrecomendation;
import com.example.methods.Ratings;
import com.example.methods.User;

import java.util.*;

public class MostActiveUser {

    public static void main(String[] args) {

        Mrecomendation ob = new Mrecomendation();
        ArrayList<Ratings> ratingsArrayList = ob.getRatingsArrayList();
        ArrayList<User> userArrayList = ob.getUserArrayList();


        ArrayList<Integer> userIDs = new ArrayList<>();

        for (User user : userArrayList) userIDs.add(user.getUser_ID());

        Map<Integer, Integer> m = new TreeMap<>(Collections.reverseOrder());


        for (Integer id : userIDs) {
            int count = 0;
            for (Ratings ratings : ratingsArrayList) {
                if (id == ratings.getUser_id()) count++;
            }
            m.put(count, id);
        }

        System.out.println("Most Active User : User ID = " + new Vector(m.values()).get(0));
        System.out.println("This user has rated movies " + new Vector(m.keySet()).get(0) + " times");

    }
}




