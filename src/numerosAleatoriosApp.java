/**
 * @author Jordi Ribellas
 */
import java.util.Scanner;
public class numerosAleatoriosApp {

	public static void main(String[] args) {
		
		System.out.println("Entre que dos numeros quieres que se genere un numero random?");
		
		Scanner n1 = new Scanner(System.in);
		int numero1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		int numero2 = n2.nextInt();
		
		numRandom(numero1, numero2);
	}

	public static void numRandom(int a, int b) {

		int nrandom = (int)(Math.random() * (b - a)+a);
		
		System.out.println("El numero random generado és " + nrandom);
		
	}
	
	
}
