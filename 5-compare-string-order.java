/* 
The grocery store organizes all of its items in ascending alphabetical order. Before you head out, you want to check to make sure that your list is alphabetized so you can pick up your items more quickly. For example, apples are in the first aisle, bean sprouts are in the second, followed by bubble gum, and zucchini comes last. When comparing characters, spaces come before any alphabetical letter (e.g. bean sprouts come before beans).

Update the isAlphabetized() method to return true if the list is in ascending alphabetical order or false if it is not.

HINT: Think about the different edge cases the grocery list could have. If there was one or no items in the groceryList, what should we return?

HINT: Strings have a .compareTo() method that will return a positive number if the string in the argument is greater than the first string, and negative if the string in the argument is less than the first string. 

HINT: Since we’re trying to compare two elements of an array, how can we avoid an IndexOutOfBounds error? Should the two counters that access the consecutive items have to traverse the entire array?
*/

public class GroceryList {
  public static boolean isAlphabetized(String[] groceryList) {
    // edge case: IF groceryList is longer than 1 item, isolate the first item.
    if (groceryList.length > 1){
      String groceryStringList = groceryList[0];

      // for loop, starting at 1
      // iterate through comparing the isolated first item to the unicode of the other items in groceryList.
      // When we call the .compareTo() method, each character in the String is converted to Unicode; then the Unicode character from each String is compared.
      // If the Strings are in the wrong order, then comparing the previous string to current string will result in a positive number, and we return false.
      for (int i = 0; i < groceryList.length; i++){
        if (groceryStringList.compareTo(groceryList[i]) > 0) {
          return false;
        }
        // print out each item
      groceryStringList = groceryList[i];
      System.out.println(groceryStringList);
      }
    }
    
    return true;
  }

  public static void main(String[] args) {
    // Below is a sample test case you can use to run your code.
    // Try playing around with different values in the array to test edge cases
    String[] groceryList = {"apples", "banana", "bananas", "chocolate"};
    System.out.println(isAlphabetized(groceryList));
  }
}


/* Explain: 

There’s a few tricky parts to this one. First, notice where our loop starts. We start our loop at 1 rather than 0. This is because we compare the String at position i to the String at the position right before i. If we were to start at 0, there wouldn’t be String before that index, and we would get an error. Another way to solve this would be to compare the String at position i with the next String. If we were to do that, we’d want to start at 0, but end at the second to last String. We would need to do this because there would be no “next” String to compare the last String to.

*/

