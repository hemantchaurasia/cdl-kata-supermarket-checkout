package com.cdl.kata.supermarket;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Main class to run the supermarket checkout
 */
class Solution {

    /*
    The solution should allow for items to input at the command line,
    and allow for a final total to be calculated and for a running total after each item is ‘scanned’.
     */
    private Scanner scanner;
    private PrintStream printStream;

    public Solution(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int exitInput = sc.nextInt();
        do {
            printStream.println("Enter the item: ");
            String item = scanner.nextLine();
            printStream.println("Enter the quantity");
            int quantity = scanner.nextInt();
            printStream.println("Item: " + item );
            printStream.println("Quantity: " + quantity );
            printStream.println("Do you want to continue your shopping. Or press 0 to finish!");
        }while(exitInput != 0);
    }

    public static void main(String[] args) {

        System.out.println(" Items and prices :");
        System.out.println(" A - 50 ");
        System.out.println(" B - 30");
        System.out.println(" C - 20");
        System.out.println(" D -  15");

        System.out.println(" Offers :");
        System.out.println(" A - 3 = 1.30");
        System.out.println(" B - 2 = .45");

        Solution solution = new Solution(System.in, System.out);
        solution.start();
    }

    public String run() {
        CheckoutItems ck = new CheckoutItems();

        // When the cart is empty check the contents
        // This should throw an exception because the cart is empty
        try {
            ck.reviewCart();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        // Here you add 3 quantities of item A
        // and then print the total price and also review the cart
        System.out.println("");
        ck.addItem("A", 3);
        try {
            ck.reviewCart();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Double totalPrice = ck.calculateTotalPrice(ck.itemsListMap);
        System.out.println("Total Price: " + totalPrice);

        // Here you add 2 quantities of item B to the existing cart
        // and then print the total price and also review the cart
        System.out.println("");
        ck.addItem("B", 2);
        try {
            ck.reviewCart();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Double totalPrice2 = ck.calculateTotalPrice(ck.itemsListMap);
        System.out.println("Total Price: " + totalPrice2);

        // Here you add 4 quantities of item C to the existing cart
        // and then print the total price and also review the cart
        System.out.println("");
        ck.addItem("C", 4);
        try {
            ck.reviewCart();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Double totalPrice3 = ck.calculateTotalPrice(ck.itemsListMap);
        System.out.println("Total Price: " + totalPrice3);

        // Here you remove 2 quantities of item B from the existing cart
        // and then print the total price and also review the cart
        System.out.println("");
        try {
            ck.removeItem("B", 2);
        } catch (Exception e1) {
            System.out.println(e1.toString());
        }
        try {
            ck.reviewCart();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Double totalPrice4 = ck.calculateTotalPrice(ck.itemsListMap);
        System.out.println("Total Price: " + totalPrice4);

        // Here you remove 1 quantity of item A from the existing cart
        // and then print the total price and also review the cart
        System.out.println("");
        try {
            ck.removeItem("A", 1);
        } catch (Exception e1) {
            System.out.println(e1.toString());
        }
        try {
            ck.reviewCart();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Double totalPrice5 = ck.calculateTotalPrice(ck.itemsListMap);
        System.out.println("Total Price: " + totalPrice5);

        // Here you empty your cart and then review
        // the total price and content of the cart
        System.out.println("");
        ck.emptyCart();
        try {
            ck.reviewCart();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Double totalPrice6 = ck.calculateTotalPrice(ck.itemsListMap);
        System.out.println("Total Price: " + totalPrice6);

        // Add item A again with quantity of 4 and review the price and content of the cart
        System.out.println("");
        ck.addItem("A", 4);
        try {
            ck.reviewCart();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Double totalPrice7 = ck.calculateTotalPrice(ck.itemsListMap);
        System.out.println("Total Price: " + totalPrice7);
        return "Cart has been processed successfully!";
    }
}

