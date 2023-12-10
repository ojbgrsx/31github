class Solution {
    public int maximum69Number (int num) {
        int counter = 0;
        String[] arr = String.valueOf(num).split("");
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals("6") && counter==0){
                counter++;
                arr[i] = "9";
            }
        }
        StringBuilder str = new StringBuilder();
        for (String i:arr){
            str.append(i);
        }
        return Integer.parseInt(str.toString());
    }
}
