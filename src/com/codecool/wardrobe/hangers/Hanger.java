package com.codecool.wardrobe.hangers;

import com.codecool.wardrobe.cloth.Cloth;
import com.codecool.wardrobe.cloth.UpperCloth;

public abstract class Hanger {
    protected UpperCloth upperCloth;

    public UpperCloth getUpperCloth() {
        return upperCloth;
    }


    public void hangCloth(Cloth cloth) {
        upperCloth = (UpperCloth) cloth;
    }
}
