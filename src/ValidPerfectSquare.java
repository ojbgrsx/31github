class Solution {
    public boolean isPerfectSquare(int num) {
        String[] arr = String.valueOf(Math.sqrt(num)).split("\\.");
        return Long.parseLong(arr[1]) == 0;
    }
}
