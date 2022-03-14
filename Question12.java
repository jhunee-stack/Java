import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) {
		int grades[]=new int[20];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<grades.length;i++){
		grades[i]=s.nextInt();
		s.close();
		if(grades[i]==-1){
		break;
		}
		}
		System.out.format("%.2f",Average(grades));
		}
		static double Average(int grades[]){
		int sum=0;
		for(int i=0;i<grades.length;i++){
		sum=sum+grades[i];
		}
		return sum/grades.length;// TODO Auto-generated method stub

	}

}
