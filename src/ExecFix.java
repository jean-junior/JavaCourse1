import java.util.Locale;

public class ExecFix {

	public static void main(String[] args) {
	
	String product1 = "Computer", product2 = "Office desk";
	int age = 30, code = 5290;
	char gender = 'F';
	
	double price1 = 2100.0 , price2 = 650.50,  measure = 53.234567;
	
	System.out.println ("Products:");
	System.out.printf ("%s, wich price is R$ %.2f %n", product1, price1);
	System.out.printf ("%s, wich price is R$ %.2f %n", product2, price2); 
	System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
	System.out.printf("%nMeasue with eight decimal places: %f", measure);
	System.out.printf("%nRouded (three decimal places): %.3f", measure);
	Locale.setDefault(Locale.US);
	System.out.printf("US decimal point: %.3f",measure);
	}
}
