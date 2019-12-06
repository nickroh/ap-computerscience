import java.util.Collections;
import java.util.Arrays;

public class QuickSort{
    public static void sort(int []arr){
        Collections.shuffle(Arrays.asList(arr));
        
        quick_sort(arr, 0, arr.length - 1);
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    private static void quick_sort(int[] arr, int f, int l) {
        int cnt = l - f;
        if (cnt <= 0) {
            return;
        }
        int left = f;
        int right = l-1;
        int point = arr[l];
        
        point = arr[l];
        
        while (true) {
            while (arr[left] < point && left<=right) {
                left++;
            }
            while (arr[right] > point && left<right ) {
                right--;
            }
            if (left >= right) {
                break;
            }
            swap(arr, left, right);
        }
        swap(arr, left, l);
        // for(int i=0;i<15;i++){
        //     System.out.printf("%d ",arr[i]);
        // }
        // System.out.println();

        // System.out.println(l);
        // System.out.println(f);
        // System.out.println(left);
        quick_sort(arr, f, left -1);
        
        quick_sort(arr ,left + 1, l );
    }
    
}