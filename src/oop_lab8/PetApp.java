package oop_lab8;

import oop_lab9.Cow;

public class PetApp {
    public static void main(String[] args) {



        Cow cow = new Cow("Namjai",5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();


    }//main
}//class
