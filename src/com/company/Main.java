package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Sadykov\\Desktop\\java\\prog\\text.txt"));
            String line = reader.readLine();

            System.out.println(line);
            reader.close();
            String[] sentences = line.split("(?<=[^ ]\\.) (?=[^a-z])");
            int count = 0;
            for(String str:sentences)
                System.out.println("Sentence " + (++count) + ":" + str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
