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





//            System.out.println(new Vector(m.keySet()).get(0));
//            System.out.println(new Vector(m.values()).get(0));
//
//        Set set = m.entrySet();
//        set.iterator();
//
//        Map.Entry<Integer, Integer> entry = m.entrySet().iterator().next();
//        int best_count = entry.getKey();
//        int user_id = entry.getValue();

//        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//
//        for (User user : userArrayList) {
//            if (user.getUser_ID() == user_id) {
//                System.out.println("User with most activity details are as follows : ");
//                System.out.println("User ID = " + user_id);
//                System.out.println("User age = " + user.getAge());
//                System.out.println("User gender = " + user.getGender());
//                System.out.println("User occupation = " + user.getOccupation());
//                System.out.println("User's zip code = " + user.getZip_code());
//                System.out.println("This user has rated movies " + best_count + " times");
//                break;
//            }
//        }
//
