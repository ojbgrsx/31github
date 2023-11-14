public class SingleNumber {
    public int singleNumber(int[] nums) {
        int c = 0;
        int index = 1;
        if(nums.length !=1){
            while (c <= nums.length - 1) {
                if (nums[index] == nums[c] && index != c) {
                    nums[index] = 0;
                    nums[c] = 0;
                    c++;
                    index = 0;
                } else if(index<c) {
                    index++;
                }else {
                    c++;
                    index =0;
                }
            }
            for (Integer i:nums){
                if (i>0 ){
                    return i;
                }
            }
        }
        return nums[0];
    }
}
