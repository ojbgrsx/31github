import java.util.HashMap;
import java.util.Map;

class Solution {

 public int romanToInt(String s) {
        String[] list = s.split("");
        HashMap<String, Integer> roman = new HashMap<>(
                Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000));
        int sum = 0;
        for (int i = list.length - 1; i >= 0; i--) {
            if (roman.get(list[i]) * 4 < sum) {
                sum -= roman.get(list[i]);
            } else {
                sum += roman.get(list[i]);
            }
        }
        return sum;
    }
}
