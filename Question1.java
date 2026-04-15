import java.util.Arrays;

public class Question1 {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        // 複製陣列以避免修改原始資料
        int[] sortedArr = arr.clone(); 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArr[j] > sortedArr[j + 1]) {
                    // 交換元素
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                }
            }
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println(Arrays.toString(bubbleSort(arr))); 
        // 預期輸出: [1, 2, 4, 5, 8]
    }
}