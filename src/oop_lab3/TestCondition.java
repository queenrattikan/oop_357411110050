package oop_lab3;

public class TestCondition {
    public static void main(String[] args) {
        //IF
        int x = 10, y = 20;
        if (x > y || x + 15 > y)
            System.out.println("x more then y");
        System.out.println("OOP");
        //      If-else
        if (x > y) {
            System.out.println("x more then y");
        } else {
            System.out.println("x less then y");
        }
        // If-else-if
        if (x < 10) {
            System.out.println("x lass then 10");
        } else if (x > 10) {
            System.out.println("x more than 10");
        } else {
            System.out.println("x is 10");
        }


    }//main
}//class
