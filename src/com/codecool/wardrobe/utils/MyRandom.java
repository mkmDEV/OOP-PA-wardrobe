package com.codecool.wardrobe.utils;

import java.util.Random;

public class MyRandom {

    private static Random random = new Random();

    public static int randInt(int min, int max){
        return min - (random.nextInt( max - min));
    }
}
