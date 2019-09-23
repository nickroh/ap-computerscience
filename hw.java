import chn.util.*;


public class chn {

	public static void main(String[] args) {
		
		double sum=0;
		double avg;
		
		Data[] data = new Data[1000];
		double[] stat = new double[200];
		double[] getans;
		
		FileInput inFile = new FileInput("C:\\Users\\roh51\\Desktop\\STUDY\\AP Computer Science\\apcs.txt"); // 저장해논 파일 경로
		int n;
		n = inFile.readInt();
		

		for(int i=0; i<n ;i++)
		{
			data[i]=new Data();
			
			data[i].name = inFile.readToken();
			data[i].a = inFile.readDouble();
			data[i].b = inFile.readDouble();
			data[i].c = inFile.readDouble();
		}

		for(int i=0;i<n;i++)
		{
			data[i].score = score(data[i].a,data[i].b,data[i].c);
		}
		
		
		
		for(int i=0; i<n;i++)
		{
			stat[i]=data[i].score;
			sum += stat[i];
		}
		avg = sum/n;
		getans = statistic(stat,avg,n);
		
		for(int i=0; i < n;i++)
		{
			System.out.printf("%s 의 성적은  %.1f\n",data[i].name,data[i].score);
		}
		System.out.println("<----------------------------------->");
		System.out.printf("분산과 표준편차는 %.1f 와 %.1f 입니다 그리고 평균은 %.1f 입니다",getans[0],getans[1],avg);
		 
	}

		
	public static double score( double a,  double b, double c)
	{
		double score=0;
		
		score = a*0.35f + b*0.35f + c*0.3f;
		
		return score;
	}
	
	public static double[] statistic(double[] arr, double a, int n)
	{
		double[] ans = new double[2];
		double total=0;
		
		for(int i=0;i<n;i++)
		{
			double tmp = arr[i] - a;
			total += tmp * tmp;
		}
		ans[0]= total / n;
		ans[1] = Math.sqrt(ans[0]);
		return ans;
	}
	
}

class Data{
	String name;
	double a;
	double b;
	double c;
	double score;
	
	public Data()
	{
	
	}
}
