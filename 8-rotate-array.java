/*
MEOW! You just fixed your list, but your cat ran across your lap to chase after your dog! Thankfully, it’s still in the right order, but the starting point of the list is now the last item in the list.

This means that the last element in the list should be the first item, the first item in the list should be the second item, and so on. For example, your original list looked like this: ["banana", "chocolate", "cookies", "ice cream"], but now it looks like this: ["chocolate", "cookies", "ice cream", "banana"].

Without creating a new array, update the .rotateGroceries() method to rotate the items one place to the right.

HINT: When we think about how we would do this manually, what are the steps that we would take. Make sure to consider all of your use cases, like how would your code handle the rotation when there are no elements or only one element in the grocery list? In this case, we might not need to take any action on the array.

HINT: In order to perform the rotations, we will need to do some swapping. When swapping items, you'll need a temporary variable to hold your value while you replace the items. For example, if I want to swap a and b, I'll need to store the value of a into c before I transfer b into a:
int a = 0;
int b = 1;
int c = a;
int a = b;
int b = c;

HINT: Now that we know how to swap items, we know that we will need to do this for every element in the array, which we can use a loop to help us with the repetition. We can build on this method of swapping elements.
One way is to use a “temporary” variable to hold the value of the previous element between each iteration through the loop. Then we can use another “temporary” variable to hold the value so we can swap between the current element and the “previous temporary” variable.

Another way could be to iterate through the array backwards, with two counters: one to keep track of the index of the current element and another to track the index of element before. Then, in every iteration of the loop, we can perform swap between the current element and element before it.
*/

public class GroceryList {
  public static void rotateGroceries(String[] groceryList) {
    // edge cases
    // In order to avoid an IndexOutOfBounds error, we only want to perform this on arrays that have a length that’s greater than 1.
    if (groceryList.length > 1) {
      String previous = groceryList[groceryList.length-1];
      for (int i=0; i<groceryList.length; i++){
        String temp = groceryList[i];
        groceryList[i] = previous;
        previous = temp;
      }
    }

  }

  public static void main(String[] args) {
    // Below is a sample test case you can use to run your code.
    // Try playing around with different values in the array to test edge cases
    String[] groceryList = {"apples", "banana", "Apples", "chocolate"};
    rotateGroceries(groceryList);

    for (String item : groceryList) {
      System.out.println(item);
    }
  }
}


/*
Solution Summary:
For this solution, we want to use a temporary variable as a substitute for our “previous” element. This way, on every iteration of the loop, it will always hold the original value of the element that comes before the current variable that is tracked by our i counter. Since the loop begins at the first index and ends at the last index, we need to preset the value of the temporary variable ,previous, to the element that comes before the first element in the array (the last element in the array).

In order to avoid an IndexOutOfBounds error, we only want to perform this on arrays that have a length that’s greater than 1. (Technically we could set the condition to be greater than 0, but we don’t need to do any swapping when there’s only 1 element in the array.)

All that’s left is to swap between the element at index i with the previous variable, similar to what we did in the previous challenge. We need another temporary variable, temp, to store the contents at index i, while we put the contents of previous into index i. This prevents the original value at i from getting lost. Finally, we set previous to temp, which holds the original value at i. This updates previous so that it is ready on the next iteration with the latest previous value.

One thing to note is that arrays are mutable, and the array that gets passed in as an argument is passed by reference. This means that any changes that are made to array will be reflected in any other place that accesses the same array. So after we run this method, we can print out the original array and verify that its contents are changed.
*/
