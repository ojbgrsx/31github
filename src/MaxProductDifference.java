class MaxProductDifference {
    public int maxProductDifference(int[] nums) {
        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        Collections.sort(list);
        int first = list.get(list.size()-1) * list.get(list.size()-2);
        int second = list.get(0)*list.get(1);
        return first - second;
    
    }
}
