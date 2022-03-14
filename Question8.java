import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int a1=n.nextInt();
		int a2=n.nextInt();
		n.close();
		if(a2%a1==0) {
		System.out.println(a1+" is a multiple of "+a2);
		}
		else {
		System.out.println(a1+" is a not a multiple of "+a2);
		}// TODO Auto-generated method stub

	}

}
