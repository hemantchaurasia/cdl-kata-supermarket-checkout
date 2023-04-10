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
    void testExpectedException() {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            checkoutItems.reviewCart();
        }, "Your cart is empty");
        Assertions.assertEquals("Your cart is empty", thrown.getMessage());
    }

}
