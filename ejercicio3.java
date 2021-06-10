import java.util.*;
import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		//pida datos de entrada
		System.out.print("ingrese numero: ");
		int num = sc.nextInt();

		//mostrar resultado
		System.out.printf("el factorial de %d es %f.0f\numero", num, factorial(num));
	}

	public static double factorial(int num) {
		double aux = 1;
		for(int i = 2; i <= num; i++) {
			aux *= i;
		}
		return aux;
	}
}