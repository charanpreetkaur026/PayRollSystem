/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import static example2.Example2.x;

/**
 *
 * @author moxdroid
 */
public class ValueTest {
    static char c = '\u0000';
    public static void main(String[] args) {
        // TODO code application logic here
        int a1 = 10, a2 = 10;

        System.out.println("C : " + c);
        System.out.println("a1 : " + a1);
        System.out.println("a2 : " + a2);

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("s3 : " + s3);

        if(s1 == s2)
        {
            System.out.println("s1 = s2");
        }
        else
        {
            System.out.println("s1 != s2");
        }

        if(s1 == s3)
        {
            System.out.println("s1 = s3");
        }
        else
        {
            System.out.println("s1 != s3");
        }

        if(s1.equals(s3))
        {
            System.out.println("s1 = s3");
        }
        else
        {
            System.out.println("s1 != s3");
        }


        if(s1.toString() == s3.toString())
        {
            System.out.println("s1 = s3");
        }
        else
        {
            System.out.println("s1 != s3");
        }

        String s4 = s3;

        if(s3 == s4)
        {
            System.out.println("s3 = s4");
        }
        else
        {
            System.out.println("s3 != s4");
        }
        System.out.println("s4 : " + s4);

        s3 = "Welcome";
        System.out.println("s4 : " + s4);
        System.out.println("s3 : " + s3);
        s4 = "Hello World";
        System.out.println("s4 : " + s4);

        System.out.println(occuranceOfCharacter('a', "Welcome to Canada"));
        System.out.println(getCount(s4));

        String name = "Kalpana";
        char searchElement = 'a';
        int count =  searchAElement(name,searchElement);
        System.out.println(" Count of Element A :"+count);
    }

    static int getCount(String s) {
        int count = 0;
        for(int i =0; i < s.length(); i++) {
            count++;
        }
        return count;
    }

    static int occuranceOfCharacter(Character c, String s) {
        int count = 0;
        for(int i =0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    static int searchAElement(String name, char searchElement){
        int sum = 0;
        char[] charB = name.toCharArray();

        for (int i = 0; charB[i] != '\u0000' ; i++) {
            System.out.println(charB[i]);
            if (charB[i] == searchElement) {
                sum += 1;
            }

        }
        return sum;
    }
}

