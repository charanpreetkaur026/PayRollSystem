package com.camy;

public class MainClass {

    public static void main(String[] args) {


        System.out.println("...............................");
        CommissionBasedPartTime emp1 = new CommissionBasedPartTime("John", 22, 30f, 10, 20);
        emp1.printMyData();
        System.out.println("...............................");
        FixedBasedPartTime emp2= new FixedBasedPartTime("Cindy", 40,30,10,40.0f );
        emp2.printMyData();


    }
}
