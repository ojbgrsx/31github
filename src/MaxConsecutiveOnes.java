class Solution {

public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int min = 0;
        for (Integer i : nums) {
            if (i == 1) {
                min++;
            } else {
                min = 0;
            }
            if (min>max){
                max = min;
            }
        }
        return max;
    }

}
