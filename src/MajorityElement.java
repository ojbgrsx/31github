class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (Integer i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }

        int key = 0;
        int value = 0;
        for (Integer i:map.keySet()){
            if(map.get(i)>value){
                key = i;
                value = map.get(i);
            }
        }
        return key;
    }
}
