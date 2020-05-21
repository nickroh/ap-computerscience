public class SelectionSort{
	
	public static void sort(int[] arr){
		
		int cnt = arr.length;

		for (int i = 0; i < cnt; i++){
		
		int min = arr[i];
		
			for (int j = i+1; j < cnt; j++){
				if (min > arr[j]){
				
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					min = arr[i];
			
				}
			}
		}
	}
	public static void sort2(int[] arr){
		int cnt = arr.length;

		for(int i=0;i<cnt;i++){
			int tmp = arr[0];
			int checkpoint = 0;
			for(int j=0;j<cnt-i;j++){
				if(tmp<arr[j]){
					tmp = arr[j];
					checkpoint = j;
				}
			}
			
			for(int k=checkpoint+1;k<cnt-i;k++){
				arr[k-1]=arr[k];
			}
			arr[cnt - i-1] = tmp;
		}


	}
	public static void reverse_sort(int[] arr){
		
		int cnt = arr.length;

		for (int i = cnt-1; i >= 0; i--){
		
		int min = arr[i];
		
			for (int j = i-1; j >= 0; j--){
				if (min > arr[j]){
				
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					min = arr[i];
			
				}
			}
		}
	}
}
