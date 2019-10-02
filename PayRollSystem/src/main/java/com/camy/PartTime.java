package com.camy;

public abstract class PartTime extends Employee implements IPrintable
{
    private float rate;
    private float hoursWorked;

    public PartTime(String name, int age, float rate, float hoursWorked) {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
 public abstract double calcEarnings();

    @Override
    public void printMyData() {
        super.printMyData();



    }
}
