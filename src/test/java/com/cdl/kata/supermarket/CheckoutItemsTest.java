package com.cdl.kata.supermarket;

import org.junit.jupiter.api.*;

public class CheckoutItemsTest {
    CheckoutItems checkoutItems;

    @BeforeEach
    public void init() {
        checkoutItems = new CheckoutItems();
    }

    @AfterEach
    public void destroy() {
        checkoutItems = null;
    }

    @Test
    @DisplayName("When Cart is empty")
    void whenCatIsEmpty() {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            checkoutItems.reviewCart();
        }, "Your cart is empty");
        Assertions.assertEquals("Your cart is empty", thrown.getMessage());
    }

    @Test
    @DisplayName("Test offer When A of 3 quantity")
    void testOfferAof3Qty() {
        CheckoutItems ck = new CheckoutItems();
        ck.addItem("A", 3);
        Double totalPrice = ck.calculateTotalPrice(ck.itemsListMap);
        Assertions.assertEquals(130, totalPrice);
    }

    @Test
    @DisplayName("Test offer When B of 2 quantity")
    void testOfferBof2Qty() {
        CheckoutItems ck = new CheckoutItems();
        ck.addItem("B", 2);
        Double totalPrice = ck.calculateTotalPrice(ck.itemsListMap);
        Assertions.assertEquals(45, totalPrice);
    }

    @Test
    @DisplayName("Test price by removing some quantity from Cart")
    void testTotalPriceRemovingItemFromCart() throws Exception {
        CheckoutItems ck = new CheckoutItems();
        ck.addItem("A", 3);
        ck.addItem("B", 2);
        ck.addItem("D", 1);
        //Remove item B
        ck.removeItem("B", 2);
        Double totalPrice = ck.calculateTotalPrice(ck.itemsListMap);
        Assertions.assertEquals(145, totalPrice);
    }

    @Test
    @DisplayName("Test emptying your cart and then review the price")
    void testEmptyCartPrice() throws Exception {
        CheckoutItems ck = new CheckoutItems();
        ck.addItem("A", 3);
        ck.addItem("B", 2);
        ck.addItem("C", 2);
        ck.addItem("D", 3);
        //Remove item B
        ck.emptyCart();
        Double totalPrice = ck.calculateTotalPrice(ck.itemsListMap);
        Assertions.assertEquals(0.0, totalPrice);
    }
}
