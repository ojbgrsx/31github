import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> innerList = new ArrayList<>();
            if (i == 0) {
                innerList.add(1);
            } else if (i == 1) {
                for (int j = 0; j <= 1; j++) {
                    innerList.add(1);
                }
            } else {
                innerList.add(1);
                for (int j = 0; j < i - 1; j++) {
                    List<Integer> q = list.get(i - 1);
                    innerList.add(q.get(j) + q.get(j + 1));
                }
                innerList.add(1);

            }
            list.add(innerList);
        }
        System.out.println(list);
        return list.get(rowIndex);
    }
}
