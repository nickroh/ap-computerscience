public class Matrix
{
	private int row;
	private int col;
	private double[][] element;

	//default constuctor
	public Matrix() {
		this.row = 3;
		this.col = 3;
		this.element = new double[row][col];
		initializeRandom(-10,10);
	}

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		element = new double[row][col];
		initializeRandom(-10,10);
	}

	public Matrix(double[][] element) {
		row = element.length;
		col = element[0].length;
		this.element = element;
	}

	public void initializeRandom(int min, int max) {
		for(int row = 0; row < element.length; row++) {
			for(int col = 0; col < element[0].length; col++)
				element[row][col] = min + (int)(Math.random() * (max - min + 1));
		}
	}

	public int rowNum()
	{return row;}
	public int colNum()
	{return col;}

	public void changeElement(int a, int b, double c)
	{this.element[a][b] = c;}

	public double element(int a, int b)
	{return this.element[a][b];}

	public double[][] elements()
	{return element;}

	public void subtractRow(int a, int b, double c)
	{
		for(int i = 0; i<row; i++){
			changeElement(a,i,element(a,i) - c*element(b,i));
		}
	}

	
	public void subtractRow(int a, int b) {
		//a = a-b
		for(int i = 0; i<col; i++)
			element[a][i] -= element[b][i];
	}

	public void multiplyRow(int a, double b) {
		//a: row number
		//b: number to multiply
		for(int i=0; i<col; i++) {
			element[a][i] *= b;
		}
	}

	public Matrix multiply(Matrix mat)
	{
		Matrix result = new Matrix(mat.rowNum(),col);
		for(int row = 0; row < result.rowNum(); row++)
		{
			for(int col = 0; col < result.colNum(); col++)
			{
				result.changeElement(row,col,0);
			}
		}
		//System.out.println("result set complete");

		for(int rowTemp = 0; rowTemp < result.rowNum(); rowTemp++)
		{
			for(int colTemp = 0; colTemp < result.colNum(); colTemp++)
			{
				for(int i = 0; i < result.rowNum(); i++)
				{
					result.changeElement(rowTemp,colTemp,result.element(rowTemp,colTemp) + element(rowTemp,i) * mat.element(i,colTemp));
					//System.out.println("row "+rowTemp+" col "+colTemp+" set complete");
				}
			}
		}
		return result;
	}

	public void switchRow(int a, int b)
	{
		double[] temp = new double[col];
		for(int i = 0; i< col; i++){
		temp[i] = element[a][i];
		element[a][i] = element[b][i];
		element[b][i] = temp[i];}
	}

	public void printMatrix(){
		for(int k = 0; k < col; k++) {
		for(int i = 0; i < row; i++) {
				System.out.print(getFormattedNumber(element[i][k], 3)+"\t");
			}
			System.out.println();
			}
		}

	public String getFormattedNumber(double num, int decimalLength) {
		Double floor = Math.pow(10, decimalLength);
		double formattedNumber = Math.round(num*floor)/floor;
		if(formattedNumber == 0) {
			return " " + formattedNumber;
		}
		if(formattedNumber > 0) {
			return "+" + formattedNumber;
		}
		return "" + formattedNumber;
	}
}