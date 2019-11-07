import java.util.*;

public class GaussianElimination{
	public static void main(String[] args){
		Scanner sio = new Scanner(System.in);
		while(true){
			System.out.println("\nGaussianElimination Calculator...");
			enter();
			sleep(0.7);
			System.out.println("Description...\n");
			sleep(0.5);
			System.out.println("Set [A] first than convert it to [A]-1 by Gaussian Elimination, Then [A]-1 is the inverse matrix of A");
			sleep(0.3);
			enter();
			System.out.println("[A] * [x] = [C], and [x] = [A]-1 * [C]...");
			sleep(0.3);
			enter();
			System.out.println("Therefore we are going to calculate [A]-1... ");
			sleep(0.3);
			enter();
			//Reading User Data, Setting Matrices.
			
			System.out.print("Number of rows and cols of the matrix : ");
			int varNum = sio.nextInt();
			Matrix matrixA = new Matrix(varNum,varNum);
			Matrix matrixI = new Matrix(varNum,varNum);
			Matrix matrixC = new Matrix(1,varNum);
			System.out.print("Matrix A is already initialized, Do you want to make your own matrix? Y or N : ");
			String input1 = sio.next();
			char random1 = input1.charAt(0);
			if(random1=='y' || random1=='Y')
			{
				for(int i = 0; i<varNum; i++) {
					for(int k = 0; k<varNum; k++) {
						System.out.print("Matrix A: What is the value of row "+i+" and column "+k+"? : ");
						int c = sio.nextInt();
						matrixA.changeElement(i,k,c);
					}
				}
				matrixA.printMatrix();
			}
			System.out.print("Matrix C is already initialized, Do you want to make your own matrix? Y or N : ");
			String input3 = sio.next();
			char random3 = input3.charAt(0);
			if(random3=='y' || random3=='Y')
			{
				for(int i = 0; i<varNum; i++) {
					for(int k = 0; k<varNum; k++) {
						System.out.print("Matrix C: What is the value of row "+i+" and column "+k+"? : ");
						int c = sio.nextInt();
						matrixC.changeElement(i,k,c);
					}
				}
			}
			System.out.print("Want to initialize identity? Y or N : ");
			String input2 = sio.next();
			char random2 = input2.charAt(0);
			if(random2=='N' || random2=='n')
			{
					for(int ia = 0; ia<varNum; ia++) {
					for(int ka = 0; ka<varNum; ka++) {
						System.out.print("Matrix I: What is the value of row "+ia+" and column "+ka+"? : ");
						int ca = sio.nextInt();
						matrixI.changeElement(ia,ka,ca);
					}
				}
			}
			else setAsIdentity(matrixI);
			//Can't use gaussian subtraction if the diagonal element is 0?
			for(int col = 0; col < varNum; col++)
			{
				for(int row = 0; row < varNum; row++)
				{
					if(matrixA.element(col,col)==0) {matrixI.switchRow(col,row); matrixA.switchRow(col,row);}
				}
			}
			System.out.println("\nThis is [A]: ");
			matrixA.printMatrix();
			enter();
			System.out.println("This is I: ");
			matrixI.printMatrix();
			enter();
			System.out.println("This is [C]: ");
			matrixC.printMatrix();
			enter();

			long start = System.currentTimeMillis();

			//Copying Data to New Matrices for Data Conservation.
			Matrix matrixA_copy = new Matrix(varNum,varNum);
			Matrix matrixI_copy = new Matrix(varNum,varNum);

			for(int rowTemp = 0; rowTemp < varNum; rowTemp++)
			{
				for(int colTemp = 0; colTemp < varNum; colTemp++)
				{
						matrixA_copy.changeElement(rowTemp, colTemp, matrixA.element(rowTemp,colTemp));
				}
			}

			for(int rowTemp = 0; rowTemp < varNum; rowTemp++)
			{
				for(int colTemp = 0; colTemp < varNum; colTemp++)
				{
						matrixI_copy.changeElement(rowTemp, colTemp, matrixI.element(rowTemp,colTemp));
				}
			}

			//Pivoting Row.
			for(int k = 0; k<varNum; k++) {
			matrixI_copy.multiplyRow(k,1.0/matrixA_copy.element(k,k));
			matrixA_copy.multiplyRow(k,1.0/matrixA_copy.element(k,k));
			}

			//Checking Pivot Situation
			/*
			System.out.println("After Pivoting matrixA_copy and matrixI_copy");
			System.out.println("matrixA_copy:");
			matrixA_copy.printMatrix();
			enter();
			System.out.println("matrixI_copy:");
			matrixI_copy.printMatrix();
			enter();
			*/

			//Making Plate to identity and Applying same orders of calculation to Inverse.
			makeItIdentity(matrixA_copy, matrixI_copy, varNum);

			System.out.println("check point");
			Matrix matrix_x = matrixI_copy.multiply(matrixC);

			//INVERSE PRINTING
			System.out.println("***** After converting [A] to [A]-1 form *****\n");
			System.out.println("This is I :");
			matrixA_copy.printMatrix();
			enter();
			System.out.println("This is [A]-1, the inverse matrix of A.");
			matrixI_copy.printMatrix();
			enter();
			System.out.println("This is x ");
			matrix_x.printMatrix();
			//Checking Errors and Calculation Time
			System.out.println("\nError in [A]-1: "+checkAccuracy(matrixA, matrixI_copy));
			System.out.println("\nError in result: "+checkAccuracy_result(matrixA,matrix_x,matrixC));
			long end = System.currentTimeMillis();
			//System.out.println("\nError in [A] * x: "+ checkAccuracy_result(matrixA, matrix_x, matrixC));
			System.out.println("Calculation time = "+((end-start)/1000.0)+"s\n");
			enter();
			enter();

			System.out.println("Again? Y or N");
			String input4 = sio.next();
			char random4 = input4.charAt(0);

			
			if(random4 =='Y'||random4 == 'y'){
				newScreen();
			}
			if(random4 == 'N' || random4== 'n'){
				System.out.println("Closing app...");
				sleep(2);
				System.exit(0);
			}
		}	
	}
		
	public static void sleep(double time){
        long a = (long)(time * 1000);
		try {
			Thread.sleep(a);
			} catch (InterruptedException e) {
			System.out.println(e.getMessage());    
			}
	}

	public static void makeItIdentity(Matrix mat1, Matrix mat2, int varNum){
		for(int col = 0; col<varNum; col++) {
			mat2.multiplyRow(col,1/mat1.element(col,col));
			mat1.multiplyRow(col,1/mat1.element(col,col));
			// mat1.printMatrix();
			// enter();
			// mat2.printMatrix();
			// System.out.println("======");
			for(int row = 0; row<varNum; row++) {
				if(col!=row){
				double factor = mat1.element(row,col);
				mat2.subtractRow(row,col,factor);
				mat1.subtractRow(row,col,factor);
				}
			}
			// mat1.printMatrix();
			// enter();
			// mat2.printMatrix();
			// System.out.println("======");
		}
	}




	public static void setAsIdentity(Matrix a){
		for(int row = 0; row < a.rowNum(); row++) {
			for(int col = 0; col < a.colNum(); col++) {
				if(row==col) a.changeElement(row,col,1);
				else a.changeElement(row,col,0);
			}
		}
	}
	
	public static void newScreen(){
		for(int i=0;i<100;i++){
			System.out.println();
		}
	}

	public static void enter(){
		System.out.println("");
	}

	public static double checkAccuracy(Matrix a, Matrix inverse) {
		Matrix identity = new Matrix(a.rowNum(),a.colNum());
		setAsIdentity(identity);
		Matrix crossed = a.multiply(inverse);
		System.out.println("\nCheck if A * [A]-1 returns I: ");
		//crossed.printMatrix();
		double error = 0;
		for(int row = 0; row < crossed.rowNum(); row++) {
			for(int col = 0; col < crossed.colNum(); col++) {
				error += Math.abs(crossed.element(row,col)-identity.element(row,col));
			}
		}
		return error/(a.rowNum()*a.colNum());
	}

	public static double checkAccuracy_result(Matrix a, Matrix b, Matrix c){
		double num=0;

		Matrix result = a.multiply(b);
		for(int row=0; row<result.rowNum(); row++){
			for(int col = 0; col< result.colNum(); col++){
				num += Math.abs(result.element(row,col)-c.element(row,col));
			}
		}
		return num/(result.rowNum()*result.colNum());
	}
}
