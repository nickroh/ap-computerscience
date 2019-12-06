public class MergeSort{

    static int sorted[];

    private static void merge(int arr[], int f, int mid, int l) {
        int i, j, k;
        i = f;
        k = f;
        j = mid + 1;

        while (i <= mid && j <= l) {
            if (arr[i] <= arr[j]) {
                sorted[k++] = arr[i++];
            }

            if (arr[i] > arr[j]) {
                sorted[k++] = arr[j++];
		    }
        }

        if (i <= mid){
		    for (int cnt = i; cnt <= mid; cnt++)	{
			    sorted[k++] = arr[cnt];
		    }
	    }
    
        if (j <= l){
		    for (int cnt = j; cnt <= l; cnt++){
		    	sorted[k++] = arr[cnt];
		    }
	    }
	
        for (int tmp = f; tmp <=l; tmp++){
    		arr[tmp] = sorted[tmp]; 
	    }
    }

	public static void merge_sort(int arr[], int f, int l){
    
        int mid = (f + l) / 2; 
	    if (f < l){
		    merge_sort(arr, f, mid); 
		    merge_sort(arr, mid + 1, l); 
		    merge(arr, f, mid, l);
	    }
    }

    public static void sort(int arr[]){
        int cnt = arr.length;
        sorted = new int[cnt];
        int initial_f = 0;
        int initial_l = cnt -1;
        merge_sort(arr, initial_f, initial_l);

    }
    
}
