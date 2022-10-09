/*
Oh no! You spent most of your money on burritos, which puts you over budget given all of the groceries on the list.

All the items in the grocery list cost a total of $33.09, but you only have $31.89. Given that every item in the list costs at least $1.20 and there is at least one item in the list, you can remove one item to stay within your budget. Update the .getMostExpensiveItemCost() method to find the most expensive item in the array of groceryPrices, and return the item.

HINT: Our aim is to find the largest number in the entire list. If we were to do this manually, we would look at each number, one by one, and compare that number to the maximum number we have so far.

HINT: We can translate our manual steps into code. This is where a loop can come in handy (to iterate through each element in the array). The comparisons can be done in the loop, so we don’t have to write each comparison.
*/


public class GroceryList {
  public static double getMostExpensiveItemCost(double[] groceryPrices) {
    // We can set the maxCost initially to the first item without an IndexOutOfBounds error because we can assume there is at least one item in the array.
    double maxCost = groceryPrices[0];
    for (double itemCost : groceryPrices) {
      if (maxCost < itemCost) {
        maxCost = itemCost;
      }
    }
 
    return maxCost;
  }

  public static void main(String[] args) {
    // Below is a sample test case you can use to run your code.
    // Try playing around with different values in the array to test edge cases
   double[] groceryPrices = {10.0, 12.3, 8.45, 2.34};
   System.out.println(getMostExpensiveItemCost(groceryPrices));
  }
}

/* 
We use an enhanced for loop again, however, this time we are also keeping track of a variable named maxCost. Whenever we find a value in our list greater than maxCost, we have to update that value. Note that the starting value for maxCost is the first item in the array. This is an assumption of our method. If we gave this method an empty array, we would run into an error.
*/


/* Extra challenge...
How would you modify your solution to return the cheapest item in the array of groceryPrices?
Answer: do the same thing but to find the smallest, we need to reverse the conditions that check for biggest item.
*/

/* Extra extra challenge...
Now, let’s assume that each item costs at least $0.00. How would you modify your solution to return the cost of the item that, when removed, allows you to spend the most money? (Remember, the total should still stay within the limits of your budget.)
HINT:
There are a couple of ways to do this. One way is to expand on our solution for the previous challenges with some modifications. As we iterate through each item in the array, what constraints are we adding on that would make an item eligible for removal?
HINT:
What extra steps can we take to find the smallest item among the eligible items for removal?
*/



