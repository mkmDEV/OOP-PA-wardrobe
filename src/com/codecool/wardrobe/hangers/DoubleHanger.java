package com.codecool.wardrobe.hangers;

import com.codecool.wardrobe.cloth.Cloth;
import com.codecool.wardrobe.cloth.LowerCloth;
import com.codecool.wardrobe.cloth.UpperCloth;

public class DoubleHanger extends Hanger {
    private LowerCloth lowerCloth;

    public LowerCloth getLowerCloth() {
        return lowerCloth;
    }

    public void hangCloth(Cloth cloth) {
        if (cloth instanceof UpperCloth) {
            upperCloth = (UpperCloth) cloth;
        } else if (cloth instanceof LowerCloth) {
            lowerCloth = (LowerCloth) cloth;
        }
        else {/*TODO error handling*/}
    }
}
