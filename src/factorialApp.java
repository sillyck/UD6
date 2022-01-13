import java.util.Scanner;

/**
 * @author Jordi Ribellas
 */
public class factorialApp {

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero");
		
		Scanner n1 = new Scanner(System.in);
		int numero1 = n1.nextInt();
		
		factorial(numero1);
		
	}
	
	public static void factorial(int x) {
		int resultat = 1;
		for(int i = x; i>0; i--) {
			resultat = resultat * i;
			if(i>1) {
				System.out.print(x + " * ");
			}else{
				System.out.print(x + " = " + resultat);
			}
			x--;
		}
		
	}

}
