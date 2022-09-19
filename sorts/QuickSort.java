public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] {6,5,4,3,2,1};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 快速排序
     *
     * @param array 要排序的数组
     * @param start 起始坐标
     * @param end   终点坐标
     */
    public static void quickSort(int[] array, int start, int end) {
        //start = end时，说明数组只有一个数，此时不必排序
        if (start >= end) return ;

//        int base = array[start];//选最左数作基数
//        int i = start;
//        int j = end;
//        while (i < j) {
//            while (array[j] >= base && i < j) {
//                j--;
//            }
//            while (array[i] <= base && i < j) {
//                i++;
//            }
//            swap(array, i, j);
//        }
//        swap(array, start, j);
//        quickSort(array, start, j - 1);
//        quickSort(array, j + 1, end);

        int base = array[end];//选最右数作基数
        int i = start;
        int j = end;
        while (i < j) {
            while (array[i] <= base && i < j) {
                i++;
            }
            while (array[j] >= base && i < j) {
                j--;
            }
            swap(array, i, j);
        }
        swap(array, i, end);
        quickSort(array, start, i - 1);
        quickSort(array, i + 1, end);
    }

    /**
     * 将数组两下标的数据对换
     *
     * @param array 数组
     * @param i     i下标
     * @param j     j下标
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
