import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text){
        String[] array = text.toLowerCase().split("");
        Map<String,Integer> map = new HashMap<>();
        for (String i:array){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int duplicates = 0;
        for (Integer i:map.values()){
            if (i>1){
                duplicates++;
            }
        }

        return duplicates;
    }
}
