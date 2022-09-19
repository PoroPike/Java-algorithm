public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};//
        System.out.println(search(array, 5));
    }

//    /**
//     * 查看目标数是否包含在数组中,返回 boolean 值
//     * @param array     指定数组
//     * @param target    目标数
//     * @return          真或假
//     */
//    public static boolean search(int[] array, int target) {
//        if (array.length == 0) return false;
//
//        int left = 0;
//        int right = array.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (array[mid] > target) {
//                right = mid - 1;
//            } else if (array[mid] < target) {
//                left = mid + 1;
//            } else if (array[mid] == target) {
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * 查找目标在数组中的下标
     * @param array     指定数组
     * @param target    目标数
     * @return          下标
     */
    public static int search(int[] array, int target) {
        if (array.length == 0) return -1;

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] > target) {//中间数大于目标数，说明目标在数组左半边
                right = mid - 1;
            } else if (array[mid] < target) {//中间数小于目标数，说明目标在数组右半边
                left = mid + 1;
            } else if (array[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
