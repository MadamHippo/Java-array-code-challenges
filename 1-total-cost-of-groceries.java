/* 

Try some code challenges involving loops and Arrays.

Loops are incredibly powerful when used together with arrays. If you need to do things like calculate a result or perform the same action on all elements of the array, you can use loops to prevent writing the same code for every element.

*/

/*
#1) Find the total cost of your groceries:

Your friend gave you a grocery list with a list of prices that correspond to each item in the grocery list. This is so you can make sure you have enough money to buy all the items.

Using a loop, update the getTotalCost() method to calculate the sum of all the groceryPrices and store the result in totalCost.
*/

public class GroceryList {
  public static double getTotalCost(double[] groceryPrices) {
    double totalCost = 0.0;
    for (double price : groceryPrices) {
      totalCost += price;
    }
    
    return totalCost;
  }

  public static void main(String[] args) {
    // Below are some sample values you can use to run your code.
    // When you're ready, uncomment the following lines one at a time to test each case. Before running each test case, think about what value you expect to see printed out.
    double[] groceryPrices = {10.0, 12.3, 8.45, 2.43};
    System.out.println(getTotalCost(groceryPrices));
    
    double[] unlikelyGroceryPrices = {100.23, -100.23, 0.0, -78.54};
    System.out.println(getTotalCost(unlikelyGroceryPrices));
  }
}

/*
Here we use an enhanced for loop. The itemCost variable stores the value of each grocery price, so we can add that value to totalCost.
*/
