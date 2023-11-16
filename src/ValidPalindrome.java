public class ValidPalindrome {
    public boolean isPalindrome(String s){
        StringBuilder str = removeNonAlphanumeric(s);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return str.toString().contentEquals(sb);
    }

    public StringBuilder removeNonAlphanumeric(String str)
    {
        return new StringBuilder(str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
    }
}
