package com.codecool.wardrobe.cloth;

import java.util.UUID;

public abstract class Cloth {
    protected UUID uuid;
    protected String brandName;

    public Cloth(String brandName) {
        this.uuid = UUID.randomUUID();
        this.brandName = brandName;
    }
}
