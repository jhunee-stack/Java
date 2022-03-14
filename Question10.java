import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double radius=s.nextDouble();
		s.close();
		sphereVol(radius);
		}
		static void sphereVol(double radius) {
		double vol = ((double)4/3)*3.14*(radius*radius*radius);
		System.out.println(vol);// TODO Auto-generated method stub

	}

}
