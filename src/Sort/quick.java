package Sort;


public class quick {
    public static void main(String[] args) {
        int[] arr = {6,1, 4, 2, 5, 7, 3};
        qicksort(arr, 0, arr.length - 1);
        System.out.println("1");
    }
    public static void qicksort(int[] arr, int start, int end) {
        if (start < end) {
            int i, j, x;
            i = start;
            j = end;
            x = arr[i];
            while (i < j) {
                while (i < j && arr[j] > x)
                    j--; // 从右向左找第一个小于x的数
                if (i < j)
                    arr[i++] = arr[j];
                while (i < j && arr[i] < x)
                    i++; // 从左向右找第一个大于x的数
                if (i < j)
                    arr[j--] = arr[i];
            }
            arr[i] = x;
            qicksort(arr, start, i - 1); /* 递归调用 */
            qicksort(arr, i + 1, end); /* 递归调用 */
        }
    }
}
