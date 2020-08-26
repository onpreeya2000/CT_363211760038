package exercise;

import java.util.Scanner;

public class Exercise_Lab3_Login {

    public static void main(String[] args) {
        //define ac

        String username = "Mit212";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);

        Scanner sa = new Scanner(System.in);

        int count = 0;
        do {
            System.out.print("Username: ");
            String u = scanner.nextLine();
            System.out.print("Password: ");
            String p = scanner.nextLine();
            if (u.equals(username) && p.equals(password)) {
                System.out.println("Welcome, to MT System.");
                break;

            } else {
                System.out.println("Username or Password not corected.");
                count++;
                if (count == 3) {
                    System.out.println("Your account has been locked. Pleae. contact admin.");
                }
            }
        } while (count < 3 );



    }

}
