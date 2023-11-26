import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStringTokens {

    public static void javaTokens(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        List<String> list = Arrays.stream(str.split(" ")).collect(Collectors.toList());
        list.removeAll(Arrays.asList("", null));
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}
