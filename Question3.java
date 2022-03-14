import java.util.Scanner;

public class Question3 {
	//private static Scanner n;
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        float fahrenheit= n.nextFloat();
        n.close();
        float celsius= (50-fahrenheit)*5/9;
        System.out.println(celsius);// TODO Auto-generated method stub
    }
}
