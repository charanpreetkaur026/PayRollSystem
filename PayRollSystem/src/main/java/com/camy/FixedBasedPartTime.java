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
}
