package exercise;

import java.util.Scanner;

//จงเขียนโปรแกรมรับค่าตัวเลขจากผู้ใช้ จากนั้นแสดงตารางสูตรคูณทางจอภาพ
public class Excersice_Lab3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integers: ");
        int num = sc.nextInt();

        for (int i = 1; i <=12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }



    }

}
