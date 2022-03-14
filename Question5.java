import java.util.Scanner;
public class Question5 {
	//private static Scanner n;
	public static void main(String[] args) {
	    Scanner n= new Scanner(System.in);
        int a1= n.nextInt();
        int a2= n.nextInt();
        n.close();
        int sum= a1+a2;
        int diff= a1-a2;
        int mul= a1*a2;
        int div= a1/a2;
        System.out.println("Addition "+ sum);
        System.out.println("Subtraction "+ diff);
        System.out.println("Multiplication "+ mul);
        System.out.println("Division "+ div);
       // TODO Auto-generated method stub

	}

}
