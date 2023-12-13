class Solution {
    public int subtractProductAndSum(int n) {
        int mult = 1;
        int sum = 0;
        String[] arr = String.valueOf(n).split("");
        for(String i:arr){
            mult*=Integer.parseInt(i);
            sum+=Integer.parseInt(i);
        }

        return mult-sum;
    }
}
