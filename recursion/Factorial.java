
public class Factorial {
	public static void main(String args[]){
	}
	static int facto(int a){
		if(a == 1){
			return 1;
		}else{
			return a*facto(a-1);
		}
	}
}