/**
 * @author Jordi Ribellas
 */
import java.util.Scanner;
public class decimalABinarioApp {

	public static void main(String[] args) {
		
		System.out.print("Introduce un numero ");
		
		Scanner n1 = new Scanner(System.in);
		int numero1 = n1.nextInt();
		
		decimalABinari(numero1);
		
	}

	public static void decimalABinari(int x) {
		
		System.out.println("El numero " + x + " en decimal és: " + Integer.toBinaryString(x));
		
	}
	
	
}
