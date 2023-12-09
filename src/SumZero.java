class Solution {
    public int[] sumZero(int n) {
                List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        int last = list.get(list.size() - 1);
        list.add(list.size() - 1, -1 * (sum - last));
        list.remove(list.size() -1);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
