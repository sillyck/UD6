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
		
		String resto = "";
		String binari = ""; 
		
		do {
			
			if(x % 2 == 0) {
				resto = "0";
			}else {
				resto = "1";
			}
			x = x / 2;
			binari = resto + binari;
			
		}while(x!=0);
		
		System.out.println("El teu numero en binari és: " + binari);
		
	}
	
	
}
