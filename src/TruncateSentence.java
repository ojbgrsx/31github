class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder string = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i=0;i<k;i++){
            string.append(arr[i]).append(" ");
        }
        string.deleteCharAt(string.length()-1);
        return string.toString();
    }
}
