public class LargestThreeSameDigits {
    public String largestGoodInteger(String num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length() - 2; i++) {
            System.out.println(num.substring(i, i + 3));
            String str = num.substring(i, i + 3);
            if (isCorrect(str) && !list.contains(Integer.parseInt(str))) {
                list.add(Integer.parseInt(num.substring(i, i + 3)));
            }
        }
        if (list.size() == 1 && list.contains(0)) {
            return "000";
        }
        return !list.isEmpty() ? Collections.max(list).toString() : "";
    }

    public boolean isCorrect(String str) {
        return str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2);
    }
}
