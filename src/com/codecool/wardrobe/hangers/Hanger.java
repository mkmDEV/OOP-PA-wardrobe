package com.codecool.wardrobe.hangers;

import com.codecool.wardrobe.utils.MyRandom;

public abstract class Hanger {
    public abstract void hangCloth();

    public void createClothes(){
        for (int i = 0; i < 10; i++) {
            if(MyRandom.randInt(0, 100) < 50){

            }
        }
    }
}
