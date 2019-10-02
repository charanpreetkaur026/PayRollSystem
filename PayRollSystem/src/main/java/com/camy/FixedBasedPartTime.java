package com.camy;

public class FixedBasedPartTime extends PartTime implements IPrintable
{
    double FixedAmount = 40.00;
    double totalEarnings;
    double calcEarnings()
    {
       totalEarnings= (getRate()* getHoursWorked())+ FixedAmount;
       return totalEarnings;
    }

    public FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount, double totalEarnings) {
        super(name, age, rate, hoursWorked);
        FixedAmount = fixedAmount;
        this.totalEarnings = totalEarnings;
    }
}
