package com.cdl.kata.supermarket;

/**
 * Class which contain offer details
 */
public class ItemOffer {
    public String name;
    public Integer quantity;
    public Double price;

    /**
     * Constructor for item offer
     * @param Name
     * @param Quantity
     * @param Price
     */
    public ItemOffer(String Name, Integer Quantity, Double Price){
        name = Name;
        quantity = Quantity;
        price = Price;
    }
}
