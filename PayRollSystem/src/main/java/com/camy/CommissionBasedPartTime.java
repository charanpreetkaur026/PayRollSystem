package com.camy;

public class CommissionBasedPartTime extends PartTime implements IPrintable
{
    float commissionPercentage;

    public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, float commissionPercentage) {
        super(name, age, rate, hoursWorked);
        this.commissionPercentage=commissionPercentage;
    }

    public float getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(float commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }
    public double calcEarnings(){
        float salary= getRate()* getHoursWorked();
        float commission= commissionPercentage*salary/100;
        float totalEarnings= salary+ commission;
        return totalEarnings;

    }
     public void printMyData(){
        super.printMyData();
        System.out.println();
        System.out.println("Name:" + getName());
        System.out.println("Year of Birth:" + calcBirthYear());
        System.out.println("Employee has");// + vehicle);
        System.out.println("Employee is Part Time / Commission Based "); //employeetype ...partTime/fulltime
        System.out.println("Rate per hour: " + getRate());
        System.out.println("Hours Worked: "+ getHoursWorked());
         System.out.println("Commission Percentage:" + commissionPercentage);
         System.out.println(" Earnings: $"+ calcEarnings());

    }
}
/**/