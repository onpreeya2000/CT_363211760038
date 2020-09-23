package Lab6;

public class Example_StringBuffer {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Onpreeya Kleebkaew");
        str.append("RUTS");
        str.insert(18, " ");
        System.out.println(str);
        str.replace(0, 8, "PA");
        System.out.println(str.reverse());



    }
}
