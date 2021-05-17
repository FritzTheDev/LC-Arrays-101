// Can also use the string equivalent & just modulo the chars - that's how I did it the first time.
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