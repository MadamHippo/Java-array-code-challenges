/* 
You recall a conversation you had with your friend, who mentioned that they are allergic to foods that have more than 5 letters in the name. How many items in the grocery list is your friend allergic to?

Update the .getNumAlllergicItems() method to count up the number of items in groceryList that has more than 5 letters. Set it to numAllergicItems.

HINT: Strings have a .length() method that will return the number of characters in the string.
*/

public class GroceryList {
  public static int getNumAllergicItems(String[] groceryList) {
    // count
    int numAllergicItems = 0;
    for (int i = 0; i < groceryList.length; i++){
      if (groceryList[i].length() > 5){
        numAllergicItems+=1;
      }

    }


    return numAllergicItems;
  }

  public static void main(String[] args) {
    // Below is a sample test case you can use to run your code.
    // Try playing around with different values in the array to test edge cases
    String[] groceryList = {"apple", "milk", "banana", "bananas", "chocolate"};

    System.out.println(getNumAllergicItems(groceryList));
  }
}

/*
EXPLAINATION:
We chose to use a regular for loop here, but we could have used an enhanced for loop. For every element in the array, we need to look at its length to see if it is greater than 5 characters long.
*/
