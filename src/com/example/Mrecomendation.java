package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.example.MostActiveUser;

public class Mrecomendation {

    public static void main(String[] args) {
        try {
           int[] activeuser;
            File myObj = new File("ratings.data");
            Scanner input = new Scanner(myObj);
            while (input.hasNext()) {
                String data = input.next();
                System.out.println(data);
                activeuser = new int [Integer.parseInt(data)+1];
                activeuser[Integer.parseInt(data)]++;
                input.next();
                input.next();
                input.next();
                int max = activeuser[1];
                System.out.println(max);
                System.out.println(activeuser.length);
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

