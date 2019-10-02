/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

/**
 *
 * @author moxdroid
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    static int x;
    int testA;
    static String fName;
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10, f = 10;
        float b = 10.5F;
        long c = 100;
        double d = 100.0;
        System.out.println("x : " + x);
        Example2 e = new Example2();
        e.x = 100;
        e.main();

        String name = new String("Hello");
        //String name = "Hello";

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("x : " + x);
        System.out.println("name : " + name);
        System.out.println("fName : " + fName);

        int aa = 1_00_00_000/1_00;
        float bb = 1_0_0__0.0_____0f;
        System.out.println("AA : " + aa);
        System.out.println("BB : " + bb);
    }

    public void main()
    {
        int a = 10;

        System.out.println("a : " + a);
        System.out.println("testA : " + testA);
    }

}

