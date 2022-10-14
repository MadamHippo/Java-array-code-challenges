/*
WOOF! While you are looking at your grocery list, your dog ran across your lap and rearranged the order of the items in your groceryList. This time, it caused the items in your groceryList to be rearranged in reverse order. For example, your original list looked like this: ["banana", "chocolate", "cookies", "ice cream"], but now it looks like this: ["ice cream", "cookies", "chocolate", "banana"].

Without creating a new array, update the .reverseGroceries() method to reverse the groceriesList back to normal.

HINT: One thing we can observe about reversed arrays is that the first element is where the last element should be, and the last element is where the first element should be. The second element is where the second to last element should be, and the second to last element is where the second element should be, and so on.

HINT: Using the observation above, we actually don’t need to traverse the entire array. We could have a counter to run through the first half of the array, and a separate counter to run through the second half of the array but backwards.

HINT: When swapping items, you'll need a temporary variable to hold your value while you replace the items. For example, if I want to swap a and b, I'll need to store the value of a into c before I transfer b into a:
int a = 0;
int b = 1;
int c = a;
int a = b;
int b = c;
*/

public class GroceryList {
  public static void reverseGroceries(String[] groceryList) {
    int right = groceryList.length - 1;

    for (int left = 0; left < groceryList.length/2; left++){
      String temp = groceryList[left];
      groceryList[left] = groceryList[right];
      groceryList[right] = temp;
      right-=1;

    }

  }


  public static void main(String[] args) {
    // Below is a sample test case you can use to run your code.
    // Try playing around with different values in the array to test edge cases
    String[] groceryList = {"apples", "banana", "Apples", "chocolate"};
    reverseGroceries(groceryList);

    for (String item : groceryList) {
      System.out.println(item);
    }
  }
}


// Please keep in mind that there are several ways to do this; this isn't the only answer!

/*The basis for this solution is to use two counters to keep track of the elements at both ends of the list, so we can swap them on each iteration of the loop. Before we start the loop, we want to create a variable, j, to hold the index at the end of the list, and we’ll use our counter in the loop to hold the index at the start of the loop, i.

As i works its way towards the end of the list, we want j to work its way towards the front of the list. This is why we decrement j at the end of the loop, and the loop takes care of incrementing i. Eventually our two counters will meet at the middle, and at this point we should stop the loop, which is why the loop is set to terminate when i hits the middle of the array, groceryList.length/2. Otherwise we will end up swapping the elements back to their original position.

All that’s left is the actual swapping. We can borrow the same concept for swapping that was outlined in one of the hints. We create a temporary variable, temp, to store the contents at index i, while we put the contents of index j into index i. This prevents the original value at i from getting lost. Finally, we set the element at index j to temp, which holds the original value at i.

One thing to note is that arrays are mutable, and the array that gets passed in as an argument is passed by reference. This means that any changes that are made to array will be reflected in any other place that accesses the same array. So after we run this method, we can print out the original array and verify that its contents are changed.
*/
