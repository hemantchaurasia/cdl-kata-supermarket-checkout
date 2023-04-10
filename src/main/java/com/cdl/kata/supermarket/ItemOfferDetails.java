package com.cdl.kata.supermarket;

import java.util.*;

/**
 * Map to hold items which have offer on them and the offer details
 */
public class ItemOfferDetails {
    public static TreeMap<String, ItemOffer> itemOfferMap = new TreeMap<String, ItemOffer>();

    static{
        itemOfferMap.put("A", new ItemOffer("A", 3, 130.0));
        itemOfferMap.put("B", new ItemOffer("B", 2, 45.0));
    }
}