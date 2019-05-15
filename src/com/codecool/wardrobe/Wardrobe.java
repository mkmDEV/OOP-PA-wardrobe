package com.codecool.wardrobe;

import com.codecool.wardrobe.hangers.Hanger;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private int capacity;
    private List<Hanger> hangers = new ArrayList<>();

    public Wardrobe(int capacity) {
        this.capacity = capacity;
    }

    public void hangHanger(Hanger hanger) {
        hangers.add(hanger);
    }

    public int getCapacity() {
        return capacity;
    }

    public void simulate() {
        for (Hanger hanger : hangers) {
            hanger.hangCloth();
        }
    }
}
