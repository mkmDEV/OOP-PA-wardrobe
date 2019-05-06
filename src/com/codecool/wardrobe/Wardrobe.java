package com.codecool.wardrobe;

import com.codecool.wardrobe.cloth.Cloth;
import com.codecool.wardrobe.cloth.LowerCloth;
import com.codecool.wardrobe.cloth.UpperCloth;
import com.codecool.wardrobe.hangers.DoubleHanger;
import com.codecool.wardrobe.hangers.Hanger;
import com.codecool.wardrobe.hangers.SingleHanger;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    public List<Hanger> getHangers() {
        return hangers;
    }

    private List<Hanger> hangers = new ArrayList<>();

    public void putHanger(int number) {
        if (number % 2 == 0) {
            hangers.add(new SingleHanger());
        } else {
            hangers.add(new DoubleHanger());
        }
    }

    public void putCloth(Cloth cloth) {
        for (Hanger hanger : hangers) {
            if (cloth instanceof LowerCloth) {
                if (hanger instanceof DoubleHanger && ((DoubleHanger) hanger).getLowerCloth() == null) {
                    ((DoubleHanger) hanger).hangCloth(cloth);
                    break;
                }
            } else if (cloth instanceof UpperCloth) {
                if (hanger.getUpperCloth() == null) {
                    hanger.hangCloth(cloth);
                    break;
                }
            }
        }
    }
}
