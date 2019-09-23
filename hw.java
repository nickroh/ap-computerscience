//input file 예시와 output file 에시는 sample 폴더 안에있음 https://github.com/nickroh/ap-computerscience/tree/master/sample
// 중간 기말 수행 35%/35%/30% 라고 가정

import chn.util.*;


public class chn {

	public static void main(String[] args) {

		double sum=0; // 성적 다 더한거
		double avg; // 평균
		
		Data[] data = new Data[1000]; // 객체 배열
		double[] stat = new double[200];
		double[] getans; 
		
		FileInput inFile = new FileInput("C:\\Users\\roh51\\Desktop\\STUDY\\AP Computer Science\\apcs.txt"); // 저장해논 파일 경로
		FileOutput outFile = new FileOutput("C:\\Users\\roh51\\Desktop\\STUDY\\AP Computer Science\\apcs_out.txt"); // 결과를 출력할 파일을 만들 위치와 파일 이름
		int n;
		n = inFile.readInt(); // 학생수
		
	
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
		for(int i=0;i<n;i++)
		{
			double a = Double.parseDouble(String.format("%.1f",data[i].score));
			outFile.print(data[i].name + "의 성적은");
			outFile.print(a + " 점 입니다\n");
		}
		System.out.println("<----------------------------------->");
		System.out.printf("분산과 표준편차는 %.1f 와 %.1f 입니다 그리고 평균은 %.1f 입니다",getans[0],getans[1],avg);
		
		
		outFile.println();
		outFile.print("<<---------------------------------------->>\n");
		
		double tmp1 = Double.parseDouble(String.format("%.1f",getans[0])); // 실수값 소수점 첫째 자리로 
		double tmp2 = Double.parseDouble(String.format("%.1f",getans[1]));
		double tmp3 = Double.parseDouble(String.format("%.1f",avg));
		
		outFile.print("분산은 " + tmp1);
		outFile.print("표준편차는 " + tmp2);
		outFile.print("평균은 " + tmp3);
		
		outFile.close();
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
