package org.andestech.learning.rfb18.g2;

import java.util.Random;

public class Utils {

    public static int getRandom(int min, int max)
    {
        int N = 1000_000;
        long seed = System.currentTimeMillis();
        int i = new Random(seed).nextInt(N);
        return min + i*(max-min)/N;

    }

    public static int getRandom2(int min, int max)
    {
       // int N = 1000_000;
        //long seed = System.currentTimeMillis();
        double dd = new Random().nextDouble();
        return min + (int)(dd*(max-min));
       //return (int)(dd*100);

    }



}
