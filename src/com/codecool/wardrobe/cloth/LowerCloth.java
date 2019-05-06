package com.codecool.wardrobe.cloth;

public class LowerCloth extends Cloth {
    private LowerType lowerCloth;

    public LowerCloth(LowerType lowerCloth, String brandName) {
        super(brandName);
        this.lowerCloth = lowerCloth;
    }
}
