package Lab7;

public class StudentApp {
    public static void main(String[] args) {

        // create object of Student class
        Student std1 = new Student();

        std1.setName("Onpreeya");
        std1.setPerson_id("1234567897485");
        std1.setAge(20);

        displayDataObject(std1);

        Student std2 = new Student();
        std2.setName("Onpreeya");
        std2.setPerson_id("1234567897485");
        std2.setAge(25);

        displayDataObject(std2);

        std2.setName("sasithorn");

        Student std3 = new Student("Kanlayanee","02134578958457",50);

        displayDataObject(std3);

        System.out.println(std3.toString());



    }//main

    private static void displayDataObject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());
    }
}//class
