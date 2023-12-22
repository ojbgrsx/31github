import java.util.HashMap;
import java.util.Map;

public class KindInDeck {

    public static void main(String[] args) {

    }

    public static boolean hasGroupsSizeX(int[] deck){
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i:deck){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for (Integer i:map.values()){
            if (i%2!=0){
                return false;
            }
        }
        return true;
    }
}
