package com.camy;

public class Intern extends Employee implements IPrintable
{
private String schoolName;

    public Intern( String name, int age, String schoolName) {
        super(name,age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public double calcEarnings() {
        return 1000;
    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("....................................................................");
        System.out.println("Name:" + getName());
        System.out.println("Year of Birth:" + calcBirthYear()); //calculate year od birth from age
        System.out.println("Employee is Intern ");//employeetype ...partTime/fulltime/intern
        System.out.println("School:" + getSchoolName());
        System.out.println("Employee has");// + vehicle);
        System.out.println(" Earnings: $"+ calcEarnings());
    }
}
