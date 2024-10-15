package com.example.javafeatures.java9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Using try-with-resources to read a file
        try (BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                System.out.println("File 1: " + line);
            }
            while ((line = reader2.readLine()) != null) {
                System.out.println("File 2: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
