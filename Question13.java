import java.util.Scanner;

//improt java.util.Scanner;
public class Question13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int balance=s.nextInt();
		int debitamount=s.nextInt();
		s.close();
		debit(balance,debitamount);
		}
		static void debit(int balance,int debitamount){
		if(balance>debitamount){
		int finalbalance=balance-debitamount;
		System.out.println(finalbalance);
		}
		else if(balance<debitamount){
		System.out.println("Debit amount exceeded balance");
		}// TODO Auto-generated method stub

	}

}
