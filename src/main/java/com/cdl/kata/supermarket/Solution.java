package com.cdl.kata.supermarket;

import java.util.Scanner;

/**
 * Main class to run the supermarket checkout
 */
class Solution {

    static CheckoutItems ck = new CheckoutItems();

    public static void start(int exitInput) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the item: ");
            String item = scanner.nextLine();
            System.out.println("Enter the quantity");
            int quantity = scanner.nextInt();

            System.out.println(" ---------------------------- :");
            if ((ItemPriceDetails.itemPriceMap.get(item) == null)) {
                System.out.println("Item is not available in store.");
            } else {
                    System.out.println("");
                    ck.addItem(item, quantity);
                    try {
                        ck.reviewCart();
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    Double totalPrice = ck.calculateTotalPrice(ck.itemsListMap);
                    System.out.println(" ---------------------------- :");
                    System.out.println("Total Price: " + totalPrice);
                }
            Scanner sc = new Scanner(System.in);
            System.out.println("To continue shopping enter 1 OR enter 0 to exit ...");
            int exitInput2 = sc.nextInt();
            exitInput = exitInput2;
        } while (exitInput != 0);
    }

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println(" ================ Available Items in store ================");
        System.out.println(" Items Name   prices :");
        System.out.println("   A            50p");
        System.out.println("   B            30p");
        System.out.println("   C            20p");
        System.out.println("   D             15");
        System.out.println(" ");
        System.out.println(" ================ Offers on Items ==============");
        System.out.println(" A   3 for 130p");
        System.out.println(" B   2 for 45p");
        System.out.println(" ");
        System.out.println(" ---------------------------------------");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to start shopping");
        System.out.println("Press 0 to quit");
        int exitInput = sc.nextInt();
        start(exitInput);
    }
}



