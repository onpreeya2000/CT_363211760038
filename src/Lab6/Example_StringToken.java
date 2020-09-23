package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("" +
                "There are plenty more fish in the sea" +
                " ยังมีปลาอีกมากมายในท้องทะเล ใช้ปลอบเพื่อนเวลาอกหัก " +
                "ว่ายังมีคนดีๆ รออยู่อีกเยอะ อย่าเสียใจไปเลย");
        StringTokenizer strToken = new StringTokenizer(str.toString());
        int countWord = strToken.countTokens();
        System.out.println("Word count: "+countWord);

        while (strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken());
        }


    }
}
