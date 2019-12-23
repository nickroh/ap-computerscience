import java.util.Arrays;

public class QuickSort{
    public static void sort(int []arr){
        arr = shuffle(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        quick_sort(arr, 0, arr.length - 1);
    }
    public static int[] shuffle(int[] arr){
        for(int x=0;x<arr.length;x++){
          int i = (int)(Math.random()*arr.length);
          int j = (int)(Math.random()*arr.length);
                
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }     
        return arr;
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
        // System.out.println("point="+ point);
        point = arr[l];
        
        while (true) {
            while (arr[left] <= point && left<=right) {
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
   
        quick_sort(arr, f, left -1);       
        quick_sort(arr ,left + 1, l );
    }
    
}
