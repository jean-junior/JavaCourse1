package java_course;

import javax.swing.JOptionPane;
import java.util.Scanner;


public class Exercicios1 {

	public static void main (String args[]) {
		
//		double lado1 = 0.0, lado2 = 0.0, valor=0.0, area=0.0, preco=0.0;
//		lado1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a largura do terreno:"));
//		lado2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do terreno:"));
//		valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do metro quadrado:"));
//		area = lado1*lado2;
//		preco=area*valor;
//	
//		JOptionPane.showMessageDialog(null, String.format("A area do terro e: %.2f  %n o Preco e de: %.2f", area, preco));
		
		double lado1 = 0.0, lado2 = 0.0, valor=0.0, area=0.0, preco=0.0;
		Scanner sc = new Scanner(System.in);
		
		lado1 = sc.nextDouble();
		lado2 = sc.nextDouble();
     	valor = sc.nextDouble();
		
		area = lado1 * lado2;
		preco = area * valor;
		
		System.out.printf("Area= %.2f %nPreco = %.2f %n", area, preco);
		
	}
	
}
