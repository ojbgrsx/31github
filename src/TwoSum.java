class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] m = new int[2];
        // int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j) {
                    m[0] = i;
                    m[1] = j;
                    return m;
                    // count++;
                    
                    // break;

                }
            }
            // if (count > 0) {
            //     break;
            // }
        }
                    return null;
    }
}
