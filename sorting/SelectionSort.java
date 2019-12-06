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
