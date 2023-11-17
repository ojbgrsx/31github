import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return integerSet.size() != nums.length;
    }

}
