import java.util.*;

class matrix{
	int col;
	int raw;

	int matrix[][];

	public matrix(){
		col = 10;
		raw = 10;

		matrix = new int[col][raw]; 

		random(col, raw, 10, -10);
	}

	void random(int a, int b, int min, int max){
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				int tmp = (int)(Math.random()*(max - min));
				tmp += min;
				matrix[i][j] = tmp;
			}
		}
	}

	public void addMatrix(int[][] arr){
		System.out.println("=================");
		if(col != arr.length){
			System.out.println("Err");
		}
		if(raw != arr[0].length){
			System.out.println("Err");
		}
		if(col == arr.length && raw == arr[0].length){


			for(int i=0;i<col;i++){
				for(int j=0;j<raw;j++){
					matrix[i][j] = matrix[i][j] + arr[i][j];
				}
			}

			for(int i=0;i<col;i++){
				for(int j=0;j<raw;j++){
					System.out.printf("%d ",matrix[i][j]);
				}
				System.out.println("");
			}
		}
	}

}

public class matrix{
	public static void main(String[] args){

		matrix a = new matrix();
		matrix b = new matrix();
		
		a.addMatrix(b.matrix);
	}
}
