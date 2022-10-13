/*
Looking at your grocery list, you suspect there may be duplicates. To make sure you don’t buy more items than you need, how would you check if there is more than one instance of any item in the array?

For simplicity, we can assume that any items that are capitalized are different from items with letters that are all lower case. For example, “apples” are not the same as “appLes”.

Update .hasDuplicateItems() to return a boolean if there are duplicate items in the list.

HINT: There are several ways we can approach this. One straightforward way is to think about how we would solve this problem if we had one string and check if there was another instance of the string in the array.
From there, we can expand it to two strings, then three, and so on. What repetition do we start to see, and can we use loops to remove duplicate code?

HINT: Using our approach from the last hint, we can apply the same principle to our array here. Instead of having two separate arrays, we can reuse the same array and iterate through the same array twice using nested loops.

*/

public class GroceryList {
  public static boolean hasDuplicates(String[] groceryList) {
    for (String items : groceryList){
      
    }
    
    return false;
  }

  public static void main(String[] args) {
    // Below is a sample test case you can use to run your code.
    // Try playing around with different values in the array to test edge cases
    String[] groceryList = {"apples", "banana", "Apples", "chocolate"};
    System.out.println(hasDuplicates(groceryList));
  }
}


/*
Code Explanation:

This is a good example of nested for loops. For every item in the array, we want to compare it to every other item. The first loop covers the “for every item in the array” part, and the second loop compares it to every other item.

One small detail to note is the starting value for j. Think about why we start j at i + 1 every time we start the second loop. Why would it be bad if j was ever equal to i? If that were the case, we would be comparing an item in the array to itself! We would say that we found a duplicate because an item would match with itself.
*/
