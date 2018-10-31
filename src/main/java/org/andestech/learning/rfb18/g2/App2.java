package org.andestech.learning.rfb18.g2;


import java.util.Random;

public class App2
{
    public static void main( String[] args )  {


       B.a = 1265765;
       B b1 = new B();

       b1.b = 29098098;
        new B();

        B.a = 10000;
        new B();

        B.test(1);
        B.test("AAA");

        B.test(1.2345);

        B.test(1.7777, String.valueOf(11));
        B.test(1.7777, ""+11);

        System.out.println(b1.aType.data);


        A a3 = new A(); a3.data="Salute!";

        B b3 = new B(a3);

        System.out.println(b3.aType.data);
        System.out.println(b3.aType.c1.valC);

        //c1.qqq.ddd.ff.meth1(1,2,3)

       }
}
