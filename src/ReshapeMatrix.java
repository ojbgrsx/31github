class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat[0].length * mat.length == r * c) {
            List<Integer> list = new ArrayList<>();
            int[][] arr = new int[r][c];
            for (int[] ints : mat) {
                for (int anInt : ints) {
                    list.add(anInt);
                }
            }
            int x = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = list.get(x);
                    x++;
                }
            }
            return arr;
        }
        return mat;
    }
}
