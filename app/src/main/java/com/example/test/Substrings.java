package com.example.test;

import java.util.ArrayList;

public class Substrings {

    public void allSubstrings(String input) {
        ArrayList<String> allSubstrings = new ArrayList<>();

        int counter = 0;
        //int i = input.length();

        //
        //boolean lastString = true;
        for(int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {

                System.out.println(input.substring(i, j));
            }

        }
    }

    public static void main(String[] args) {

        String frog = "Frog";
        Substrings substrings = new Substrings();
        substrings.allSubstrings(frog);

    }
}
