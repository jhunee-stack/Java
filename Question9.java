import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int count =n.nextInt();
		int arr[]=new int[count];
		for(int i=0;i<count;i++) {
		arr[i]=n.nextInt();
		n.close();
		}
		int largest=arr[0];
		for(int i=0;i<count;i++) {
		int number=arr[i];
		if(number>largest) {
		largest=arr[i];
		}
		}
		System.out.println(largest);// TODO Auto-generated method stub

	}

}
