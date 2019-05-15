package com.codecool.wardrobe;

import com.codecool.wardrobe.hangers.DoubleHanger;
import com.codecool.wardrobe.hangers.SingleHanger;
import com.codecool.wardrobe.utils.MyRandom;

public class Main {
    public static void main(String[] args) {
        int capacity = 10;
        Wardrobe wardrobe = new Wardrobe(capacity);
        hangHangers(wardrobe);
        wardrobe.simulate();
    }

    private static void hangHangers(Wardrobe wardrobe) {
        for (int i = 0; i < wardrobe.getCapacity(); i++) {
            if (MyRandom.randInt(0, 100) < 50) {
                wardrobe.hangHanger(new SingleHanger());
            } else {
                wardrobe.hangHanger(new DoubleHanger());
            }
        }
    }
}
