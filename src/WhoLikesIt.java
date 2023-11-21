class Solution {
    public static String whoLikesIt(String... names) {
        StringBuilder builder = new StringBuilder();
        String[] arr = names;
        if (arr.length == 0) {
            return "no one likes this";
        } else if (arr.length == 1) {
            return arr[0] + " likes this";
        } else if (arr.length < 4) {
            for (int i = 0; i < arr.length; i++) {
                builder.append(arr[i]);
                if (i == arr.length - 2) {
                    builder.append(" and ");
                } else if(i<1){
                    builder.append(", ");
                }

            }
            builder.append(" like this");
        } else {
          builder.append(String.format("%s, %s and %d others like this",arr[0],arr[1],arr.length-2));
        }
        return builder.toString();
    }
}
