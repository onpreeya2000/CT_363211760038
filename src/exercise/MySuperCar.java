package exercise;

import java.security.interfaces.RSAPrivateCrtKey;

public class MySuperCar {
    public static void main(String[] args) {

        SuperCar spc1 = new SuperCar();

        spc1.setCarbrand("Porsche");
        spc1.setCarcolor("Purple");
        spc1.setCarenginesize(1988);
        spc1.setMaxspeed(800);
        spc1.setCountryoforigin("Germany");

        displayDataObject(spc1);

        SuperCar spc2 = new SuperCar();

        spc2.setCarbrand("Porsche");
        spc2.setCarcolor("Red");
        spc2.setCarenginesize(1988);
        spc2.setMaxspeed(800);
        spc2.setCountryoforigin("Germany");

        displayDataObject(spc2);

        SuperCar spc3 = new SuperCar();

        spc3.setCarbrand("Porsche");
        spc3.setCarcolor("Black");
        spc3.setCarenginesize(1988);
        spc3.setMaxspeed(800);
        spc3.setCountryoforigin("Germany");

        displayDataObject(spc3);

        SuperCar spc4 = new SuperCar();

        spc4.setCarbrand("Porsche");
        spc4.setCarcolor("pink");
        spc4.setCarenginesize(1988);
        spc4.setMaxspeed(800);
        spc4.setCountryoforigin("Germany");

        displayDataObject(spc4);

        SuperCar spc5 = new SuperCar();

        spc5.setCarbrand("Porsche");
        spc5.setCarcolor("Yellow");
        spc5.setCarenginesize(1988);
        spc5.setMaxspeed(800);
        spc5.setCountryoforigin("Germany");

        displayDataObject(spc5);



    }//main

    private static void displayDataObject(SuperCar spc) {
        System.out.println(spc.getCarbrand());
        System.out.println(spc.getCarcolor());
        System.out.println(spc.getCarenginesize());
        System.out.println(spc.getMaxspeed());
        System.out.println(spc.getCountryoforigin());
    }
}//class
