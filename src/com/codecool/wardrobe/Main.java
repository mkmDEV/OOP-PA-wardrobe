package com.codecool.wardrobe;

import com.codecool.wardrobe.cloth.LowerCloth;
import com.codecool.wardrobe.cloth.UpperCloth;

import static com.codecool.wardrobe.cloth.LowerType.SKIRT;
import static com.codecool.wardrobe.cloth.LowerType.TROUSER;
import static com.codecool.wardrobe.cloth.UpperType.SHIRT;

public class Main {

    public static void main(String[] args) {
	    Wardrobe wardrobe = new Wardrobe();

        for (int i = 0; i < 20; i++) {
            wardrobe.putHanger(i);
        }
        System.out.println(wardrobe.getHangers());

        wardrobe.putCloth(new LowerCloth(SKIRT, "Adidas"));
        wardrobe.putCloth(new UpperCloth(SHIRT, "Nike"));
        wardrobe.putCloth(new UpperCloth(SHIRT, "Nikeeee"));
        wardrobe.putCloth(new LowerCloth(TROUSER, "PUMA"));
    }
}
