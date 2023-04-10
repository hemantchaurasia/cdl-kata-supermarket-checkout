package com.cdl.kata.supermarket;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void init() {
        //solution = new Solution();
    }

    @AfterEach
    public void destroy() {
        solution = null;
    }

    @Test
    @DisplayName("All done!")
    public void whenNotEnterAValidInputNumber() {
        assertEquals("Cart has been processed successfully!", solution.run());
    }
/*
* Your cart is empty

Item: A of Quantity: 3
Total Price: 130.0

Item: A of Quantity: 3
Item: B of Quantity: 2
Total Price: 175.0

Item: A of Quantity: 3
Item: B of Quantity: 2
Item: C of Quantity: 4
Total Price: 255.0

Item: A of Quantity: 3
Item: C of Quantity: 4
Total Price: 210.0

Item: A of Quantity: 2
Item: C of Quantity: 4
Total Price: 180.0

java.lang.Exception: Your cart is empty
Total Price: 0.0

Item: A of Quantity: 4
Total Price: 180.0

Process finished with exit code 0
* */
    /*
    @Test
    @DisplayName("Test for valid input number between 1-9999")
    public void whenNotEnterAValidInputNumber() {
        assertEquals(-1, solution.run(0));
        assertEquals(-1, solution.run(10000));
    }

    @Test
    @DisplayName("Test f(N+1) term")
    public void whenNumberIsValidIncreasingOrder() {
        assertEquals(3, solution.run(3));
        assertEquals(4, solution.run(5));
        assertEquals(4, solution.run(6));
        assertEquals(5, solution.run(10));
        assertEquals(6, solution.run(11));
        assertEquals(7, solution.run(18));
        assertEquals(21, solution.run(100));
        assertEquals(132, solution.run(2000));
        assertEquals(218, solution.run(4500));
        assertEquals(232, solution.run(5000));
        assertEquals(273, solution.run(6500));
        assertEquals(286, solution.run(7000));
        assertEquals(298, solution.run(7500));
        assertEquals(322, solution.run(8500));
        assertEquals(345, solution.run(9500));
        assertEquals(356, solution.run(9999));
    }
*/

}
