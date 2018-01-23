package oop_lab7;
//1.car brand
//2.car color
//3.car engine size
//4.max speed
//5.country of origin

public class SuperCar {

    public String getSuperCarInfo() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", enginesize='" + enginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    private String brand;
    private String color;
    private String enginesize;
    private String maxspeed;
    private String country;

    public SuperCar(){}

    public SuperCar (String b,String c, String e,String m,String o){
        //asigne data to class properties
        this.brand = b;
        this.color = c;
        this.enginesize = e;
        this.maxspeed = m;
        this.country = o;
    }
    //getter and setter methods


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnginesize() {
        return enginesize;
    }

    public void setEnginesize(String enginesize) {
        this.enginesize = enginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}//class
