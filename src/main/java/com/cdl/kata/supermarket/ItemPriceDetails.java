package com.cdl.kata.supermarket;

import java.util.*;

/**
 * Price of individual item
 */
public class ItemPriceDetails {
    public static TreeMap<String, Double> itemPriceMap = new TreeMap<String, Double>();

    static{
        itemPriceMap.put("A", 50.0);
        itemPriceMap.put("B", 30.0);
        itemPriceMap.put("C", 20.0);
        itemPriceMap.put("D", 15.0);
    }
}
