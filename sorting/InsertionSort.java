public class InsertionSort{
	
	public static void sort(int[] arr){
		
		int cnt = arr.length;

		for (int i = 1; i < cnt; i++){
        
            int key = arr[i];
		    for (int j = 1; j <= i; j++){
			    if (arr[i - j] > key){
				    arr[i - j + 1] = arr[i - j];
			    	arr[i - j] = key;
			    }else{
			    	break;
			    }
		    }
	    }
	}
	public static void reverse_sort(int[] arr){
		
		int cnt = arr.length;

		for (int i = cnt-2; i >= 0; i--){
        
            int key = arr[i];
		    for (int j = 1; j <= cnt-1-i ; j++){
			    if (arr[i + j] > key){
				    arr[i + j -1 ] = arr[i + j];
				    arr[i + j] = key;
			    }else{
			    	break;
			    }
		    }
	    }
	}
}
