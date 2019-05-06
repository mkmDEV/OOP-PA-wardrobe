package com.codecool.wardrobe.cloth;

public class UpperCloth extends Cloth{
    private UpperType upperType;

    public UpperCloth(UpperType upperType, String brandName) {
        super(brandName);
        this.upperType = upperType;
    }
}
