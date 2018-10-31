package org.andestech.learning.rfb18.g2;

public class B {

    A aType;

    static
    {

        System.out.println("++ static ctor +++");
        a = 837987;
        MONTH = 10;

    }

    public B(){
        System.out.println("++ ctor: " + this);
        aType = new A();
        aType.data="Салют!";
    }

    public B(A aType){
        System.out.println("++ ctor: " + this);
        this.aType = aType;
    }


    public static int a;
    //public static final int MONTH = 10;
    public static final int MONTH;

    public int b;


//    public static void test(int a)
//    {
//        System.out.println("test1: " +a );
//    }

    public static void test(String a)
    {
        System.out.println("test2: " +a );
    }

    public static void test(double a)
    {
        System.out.println("test3: " +a );
    }

    public static void test(double a, String b)
    {
        System.out.println("test4: " +a );
    }

}
