class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for (int i=0;i<nums.length;i++){
            for (int j=1;j<nums.length;j++){
                if (i!=j && (nums[i]-1)*(nums[j]-1)>max){
                    max = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return max;
    }
}
