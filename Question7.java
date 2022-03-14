import java.util.Scanner;
public class Question7 {
	 public static void main(String[] args) {
		 Scanner n= new Scanner(System.in);
		 int a1=n.nextInt();
	     int a2=n.nextInt();
	     int a3=n.nextInt();
	     int sum=a1+a2+a3;
	     n.close();
	     int product=a1*a2*a3;
	     double avg=a1+a2+a3/3;
	     System.out.println("Sum = "+ sum);
	     System.out.println("Product = "+product);
	     System.out.println("Average = "+avg);
	     large(a1,a2,a3);
	     small(a1,a2,a3);
	 }
	     static void large(int a1,int a2,int a3) {
	    	 if(a1>a2&&a1>a3) {
	    	 System.out.println(a1+" is larger");
	    	 }
	    	 else if(a2>a3&&a2>a1) {
	    	 System.out.println(a2+" is greater");
	    	 }
	    	 else {
	    	 System.out.println(a3+" is greater");
	    	 }
	    	 }
	    	 static void small(int a1,int a2,int a3) {
	    	 if(a1<a2&&a1<a3) {
	    	 System.out.println(a1+" is smaller");
	    	 }
	    	 else if(a2<a1&&a2<a3) {
	    	 System.out.println(a2+" is smaller");
	    	 }
	    	 else {
	    	 System.out.println(a3+" is smaller");
	 }
}
}