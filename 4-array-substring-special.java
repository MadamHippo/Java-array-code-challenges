/* As you enter the store, a greeter congratulates you on being their 99th customer! Any item in your cart that ends with 99 cents will make your entire bill $0.00!

Update the .hasSpecialItem() method to return true if there is an item in your list that ends with 99 cents, and false if there is not an item that ends with 99 cents.

HINT: 
There are a couple of ways you can determine if a number ends with $0.99.
1. Cast the number as a String, and check the substring of the last 2 characters.
OR
2. - Another way could be to use the mod, %, operator and check if you can mod the price by 1. Before you check for equality, you may need to isolate the first two decimal places, which you can do by multiplying by 100 and using Math.floor().
*/

public class GroceryList {
  public static boolean hasSpecialItem(double[] groceryPrices) {
    for (double item : groceryPrices){
      String itemCost = String.valueOf(item);
      // This one is all about checking the characters in a String. We use substring to grab the last 2 characters of the String. Note that we first make sure that our String is at least 2 characters long! In code challenges like this, it’s often important to think about those edge cases!
      if (itemCost.length() > 1 && itemCost.substring(itemCost.length() - 2, itemCost.length()).equals("99")) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    // Below is a sample test case you can use to run your code.
    // Try playing around with different values in the array to test edge cases
    double[] groceryList = {10.0, 89.9, 8.99, 2.34};
    System.out.println(hasSpecialItem(groceryList));
  }
}

/*
This one is all about checking the characters in a String. We use substring to grab the last 2 characters of the String. Note that we first make sure that our String is at least 2 characters long! In code challenges like this, it’s often important to think about those edge cases!
*/
