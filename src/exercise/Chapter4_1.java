package exercise;

import java.util.Scanner;

public class Chapter4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a score 1 : ");
        int a =scanner.nextInt();
        System.out.println("Enter a score 2 : ");
        int b =scanner.nextInt();
        System.out.println("Enter a score 3 : ");
        int c =scanner.nextInt();
        System.out.println("Enter a score 4 : ");
        int d =scanner.nextInt();
        System.out.println("Enter a score 5 : ");
        int e =scanner.nextInt();
        System.out.println("Enter a score 6 : ");
        int f =scanner.nextInt();
        System.out.println("Enter a score 7 : ");
        int g =scanner.nextInt();
        System.out.println("Enter a score 8 : ");
        int h =scanner.nextInt();
        System.out.println("Enter a score 9 : ");
        int i =scanner.nextInt();
        System.out.println("Enter a score 10 : ");
        int j =scanner.nextInt();

        int total = a + b + c + d + e + f + g +h + i + j;
        int avg = total / 10;

        //display result
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);



    }
}
