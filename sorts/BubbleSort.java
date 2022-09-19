public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {//每一次循环都能把循环体内的最大数移到最右边
            for (int j = 0;j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
