package com.camy;

import java.time.LocalDate;

public abstract class Employee
{

      private String name;
      private int age;



      int calcBirthYear(){
          LocalDate currentYear= LocalDate.now();
          int birthYear= currentYear.getYear();

      }



    }

