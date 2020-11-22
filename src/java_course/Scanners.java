package java_course;
import java.util.Locale;
import java.util.Scanner;


public class Scanners {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x = "";
		int y = 0;
		double z = 0.0;
	
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		//x = sc.next().charAt(0);//
		System.out.println("Dados digitados ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
