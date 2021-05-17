# LeetCode Arrays 101 Notes (Part 2)

### (Exercise) Max Consescutive Ones

> Given a binary array nums, return the maximum number of consecutive 1's in the array.

#### My Solution:
```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int topStreak = 0;
        int currentStreak = 0;
        for (int num : nums) {
            if (num == 1) {
                currentStreak++;
                if (currentStreak > topStreak) {
                    topStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }
        return topStreak;
    }
}
```

### (Exercise) Find Numbers with Even Number of Digits
> Given an array nums of integers, return how many of them contain an even number of digits.

#### My old solution ("cheating" with .toString())
```ts
function findNumbers(nums: number[]): number {
    // create a counter
    let count = 0;
    
    nums.forEach((num) => {
    // convert num to a string then divide its length by two.
    // if the modulus (remaminder) is 0, increment the count.
        if(num.toString().length % 2 === 0) {
            count++   
        }
    });
    
    return count;
};
```

#### The "Better" Java Solution

```java
class Solution {
    public int findNumbers(int[] nums) {
        int evens = 0;
        for (int num : nums) {
            int digits = 1;
            while (num > 9) {
                num = num / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }
}
```

#### (Exercise) Sort an array by its elements squared values
> Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

The prompt also hints at a lower-complexity solution here but I can't figure out what it is, even after seeing examples of faster-runtime code.

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
```