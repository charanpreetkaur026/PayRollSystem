package com.camy;

public class FixedBasedPartTime extends PartTime implements IPrintable
{
    double fixedAmount ;
    double totalEarnings;
    public FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount) {
       super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }
    public double calcEarnings()
    {
        totalEarnings= (getRate()* getHoursWorked())+ fixedAmount;
        return totalEarnings;
    }
    public void printMyData(){
        System.out.println("....................................................................");
        System.out.println("Name:" + getName());
        System.out.println("Year of Birth:" + calcBirthYear()); //calculate year od birth from age
        System.out.println("Employee has");// + vehicle);
        System.out.println("Employee is Part Time / Fixed Amount Based "); //employeetype ...partTime/fulltime
        System.out.println("Rate per hour: " + getRate());
        System.out.println("Hours Worked: "+ getHoursWorked());
        System.out.println("Fixed Amount:" + totalEarnings);
        System.out.println(" Earnings: $"+ calcEarnings());


    }
}
