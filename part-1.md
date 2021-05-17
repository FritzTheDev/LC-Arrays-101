# LeetCode Arrays 101 Notes (Part 1)

Learning Java while doing this unit. Advisable? Probably not, but I want to get used to writing in the language interviewers are used to seeing.

### Basics / What Is An Array?
- Data Structure that contains other data
- Fixed Length (Decided when the array is instantiated) & can contain a single data type (in Java). Syntax for creating a new array looks something like this, where DVD = a class.

```java
DVD[] dvdCollection = new DVD[10];
```

### Accessing Elements In Arrays
From LeetCode:
> The two most primitive Array operations are writing elements into them, and reading elements from them. All other Array operations are built on top of these two primitive operations.

Java syntax to put an element in the eighth position in an array:

```java
DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

dvdCollection[7] = avengersDVD;
```

Elements in an array can be overwritten: for instance, if we added a new DVD at dvdCollection[7], The Avengers would be gone.

Positions in an array that haven't been set to anything are set to null by default (in Java - C, for instance, handles this differently)

```java
// Assumes you've set the toString() method on the DVD class
System.out.println(dvdCollection[7]); // The Avengers, directed by Joss Whedon, released in 2012
System.out.println(dvdCollection[3]); // null
```

### Writing Items Into An Array With A Loop
Writing a bunch of items into an array with a loop is a pretty typical pattern. For instance, here's some code that puts the first 10 numbers into an int array ten positions long.

int[] squareNumbers = new int[10];

// Go through each of the Array indexes, from 0 to 9.

```java
for (int i = 0; i < 10; i++) {
// Because the iterator is 0-indexed, The next square number is given by (i + 1) * (i + 1).
// Calculate it and insert it into the Array at "i".
    int square = (i + 1) * (i + 1);
    squareNumbers[i] = square;
}
```

We can also use a loop to list off all the values of an array:

```java
for (int i = 0; i < 10; i++) {
    // Access and print what's at the i'th index.
    System.out.println(squareNumbers[i]);
}
// Will print:
// 1
// 4
// 9
// 16
// etc...
```

### For Each Loop:
The For Each loop is a shortcut that does ~ the same thing with a little less code. It's useful if you know you're going to iterate through every value in the array.

```java
// For each VALUE in the Array.
for (int square : squareNumbers) {
    // Print the current value of square.
    System.out.println(square);
}
// Prints exactly the same as the previous example.
```

### Array Length vs. Capacity
(According to LeetCode...)
##### Array Capacity
Array **capacity** describes how many elements an array *can* hold.

The Array.length property is = to the capacity of the array.

##### Array Length
Array **Length** describes how many elements are *currently* held in an array.

Tracking an array's length is tough because you have to do it yourself, and important so that you know where you can write without overwriting existing data.

### Handling Array Paramaters
From Leetcode:
>Most Array questions on LeetCode have an Array passed in as a parameter, with no "length" or "capacity" parameter. What do we mean by this? Well, let's look at an example. Here is the description for the first problem you'll be asked to solve. 

> The only parameter is nums; an Array. You couldn't possibly solve this question without knowing how long nums is. Well, luckily it's straightforward. When an Array is given as a parameter, without any additional information, you can safely assume that length == capacity. That is, the Array is the exact right size to hold all of it's data. We can, therefore, use .length.

(Example Problem Template)

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to 
        // keep track of how many 1's you've seen in a row.
        for (int i = 0; i < nums.length; i++) {
            // Do something with element nums[i].
        }
    }
}
```