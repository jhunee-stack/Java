import java.util.Scanner;

public class Question6 {
	//private static Scanner n;
	public static void main(String[] args) {
		Scanner n =new Scanner(System.in);
		int a1=n.nextInt();
		int a2=n.nextInt();
		 n.close();
		if(a1==a2) {
		System.out.println("These numbers are equal");
		}
		else if(a1>a2) {
		System.out.println(a1+" is greater");
		}
		else {
		System.out.println(a2+" is greater");
		}// TODO Auto-generated method stub

	}

}
