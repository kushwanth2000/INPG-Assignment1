package com.example;

import com.example.methods.Ratings;
import com.example.methods.User;
import com.example.methods.movies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class Mrecomendation {

    private static ArrayList<Ratings> ratingsArrayList = new ArrayList<>();
    private static ArrayList<User> userArrayList = new ArrayList<>();
    private static ArrayList<movies> moviesArrayList = new ArrayList<>();


    public ArrayList<Ratings> getRatingsArrayList() {
        try {
            File ratingsfile = new File("ratings.data");
            Scanner myReader = new Scanner(ratingsfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] st = data.split("\\s+");

                if (st.length == 4) {
                    Ratings rating = new Ratings(Integer.parseInt(st[0]), Integer.parseInt(st[1]),
                            Integer.parseInt(st[2]), Integer.parseInt(st[3]));
                    ratingsArrayList.add(rating);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return ratingsArrayList;
    }


    public ArrayList<User> getUserArrayList() {
        try {
            File user_file = new File("user.data");
            Scanner myReader = new Scanner(user_file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                String[] st = data.split("[|]");
                if (st.length == 5 && st[0]!=""&& st[1]!="" && st[2]!=""&& st[3]!=""&& st[4]!="") {
                    User user = new User(Integer.parseInt(st[0]), Integer.parseInt(st[1]), st[2], st[3], Integer.parseInt(st[4]));
                    userArrayList.add(user);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return userArrayList;
    }




}



//    static Integer MostActiveuser(String fileName) {
//        int max =0;
//        try {
//            HashMap<Integer, Integer> users = new HashMap<>();
//            List<Integer> MostActive = new ArrayList<>();
//            File myObj = new File(fileName);
//            Scanner input = new Scanner(myObj);
//            while (input.hasNext()) {
//                String data = input.next();
//                System.out.println(data);
//                if(users.containsKey(Integer.parseInt(data))) {
//                  int old = users.get(Integer.parseInt(data));
//                          users.put(Integer.parseInt(data),old+1);
//                }
//                    else
//                    users.put(Integer.parseInt(data),1);
//                input.next();
//                input.next();
//                input.next();
//                }
//            if(users.containsKey(2))
//                System.out.println(users.get(2));
//
//            input.close();
//
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        return max;
//    }





//        public static void main(String[] args) {
////            Integer MostActiveuser = MostActiveuser("ratings.data");
//
//
//
//        }


