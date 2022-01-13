import java.util.Scanner;

/**
 * @author Jordi Ribellas
 */
public class numeroCifraas {

	public static void main(String[] args) {
		
		System.out.print("Introduce un numero ");
		
		Scanner n1 = new Scanner(System.in);
		int numero1 = n1.nextInt();
		
		contarDigitos(numero1);
		
	}
	
	public static void contarDigitos(int x) {
		
		String xString = Integer.toString(x);
		
		System.out.println("El numero instroduit té " + xString.length() + " digits");
		
	}

}
