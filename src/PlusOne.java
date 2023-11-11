public class PlusOne {
    public int[] plusOne(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                return array;
            }
            array[i] = 0;
        }
        array = new int[array.length + 1];
        array[0]++;
        return array;
    }
}