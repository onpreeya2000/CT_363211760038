package exercise;

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private int carenginesize;
    private int maxspeed;
    private String countryoforigin;

    public SuperCar(){}

    public SuperCar(String m,String b,int a,int r,String k) {
        carbrand = m;
        carcolor = b;
        carenginesize = a;
        maxspeed = r;
        countryoforigin = k;
    }

    public String getCarbrand(){
        return carbrand;
    }
    public void setCarbrand(String m) {
        carbrand = m;
    }
    public String getCarcolor() {
        return carcolor;
    }
    public void setCarcolor(String b) {
        carcolor = b;
    }
    public int getCarenginesize(){
        return carenginesize;
    }
    public void setCarenginesize(int a) {
        carenginesize = a;
    }
    public int getMaxspeed(){
        return maxspeed;
    }
    public void setMaxspeed(int r){
        maxspeed = r;
    }
    public String getCountryoforigin(){
        return countryoforigin;
    }
    public void setCountryoforigin(String k){
        countryoforigin = k;
    }





}
