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