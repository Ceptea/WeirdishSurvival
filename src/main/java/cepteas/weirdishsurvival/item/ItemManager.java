package cepteas.weirdishsurvival.item;

import cepteas.weirdishsurvival.item.impl.BreakerItem;

import java.util.ArrayList;

public class ItemManager {
    static ArrayList<CustomItem> items = new ArrayList<>();
    public static ArrayList<CustomItem> items() {
        return items;
    }

    public static void add(CustomItem item) {
        items.add(item);
    }

    public static void init() {
        add(new BreakerItem());
    }
}
