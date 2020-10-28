package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter Your Height Is M");

        System.out.println("Please Enter Your Weight Is Kg");

        double Height ;
        String H = "";

        double Weight ;
        String W = "";
        double b = 0.0d;

        try{
            System.out.println("Enter Height");
            H = br.readLine();
            System.out.println("Enter Weight");
            W = br.readLine();

        }

        catch (IOException e) {
            System.out.println("Error"); }

        Height = Double.parseDouble(H);
        Weight = Double.parseDouble(W);
        b = Weight/(Height*Height);

        System.out.println("BMI"+ b);

        if (18.5 <b) {
            if (b<22.9)
                System.out.println("normal");
        }
        if (23.0 <b) {
            if (b<29.9)
                System.out.println("plump");
        }
        if (b>30) {
            System.out.println("fat");
        }
        if (b<18.5) {
            System.out.println("thin");
        }


    }
}
