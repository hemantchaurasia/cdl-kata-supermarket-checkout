# cdl-kata-supermarket-checkout
## CDL kata supermarket checkout

### How to run the solution? 
- Checkout the code and run **main()** method from Solution class.
- To run the unit test cases, install the dependencies (mvn clean install) then run the test cases.
- While running the solution/main() method you will find menu, like below the screen shot:    
![img.png](img.png)

### Problem statement:

Implement the code for a checkout system that handles pricing schemes such as “apples cost 50 pence, three apples cost £1.30.”
Implement the code for a supermarket checkout that calculates the total price of a number of items. In a normal supermarket, things are identified using Stock Keeping Units, or SKUs. In our store, we’ll use individual letters of the alphabet (A, B, C, and so on). Our goods are priced individually. In addition, some items are multi-priced: buy ‘n’ of them, and they’ll cost you ‘y’ pence. For example, item ‘A’ might cost 50 pence individually, but this week we have a special offer: buy three ‘A’s and they’ll cost you £1.30.

Use these prices for the sample:
<table border="1">
    <tr>
        <td>
            Item
        </td>
        <td>
            Unit Price (pence)
        </td>
        <td>
            Special Price (pence)
        </td>
    </tr>
    <tr>
        <td>
            A
        </td>
        <td>
            50
        </td>
        <td>
            3 for 130
        </td>
    </tr>
    <tr>
        <td>
            B
        </td>
        <td>
            30
        </td>
        <td>
            2 for 45
        </td>
    </tr>
    <tr>
        <td>
            C
        </td>
        <td>
            20
        </td>
        <td>
            Special Price (pence)
        </td>
    </tr>
    <tr>
        <td>
            D
        </td>
        <td>
            15
        </td>
        <td>
            Special Price (pence)
        </td>
    </tr>
</table>

Our checkout accepts items in any order, so that if we scan a B, an A, and another B, we’ll recognize the two B’s and price them at 45 (for a total price so far of 95). Because the pricing changes frequently, we need to be able to pass in a set of pricing rules each time we start handling a checkout transaction.

The solution should allow for items to input at the command line, and allow for a final total to be calculated and for a running total after each item is ‘scanned’.
