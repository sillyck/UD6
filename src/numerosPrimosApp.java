import java.util.Scanner;

/**
 * 
 * @author Jordi Ribellas
 */
public class numerosPrimosApp {

	public static void main(String[] args) {
		
		System.out.println("Introduce un numero");
		
		Scanner n1 = new Scanner(System.in);
		int numero1 = n1.nextInt();

		if(primoONo(numero1)) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
		
	}

	public static boolean primoONo(int n1) {
		
		for(int i=2;i<n1;i++) {
	        if(n1%i==0) {
	        	return false;
	        }
	    }
	    return true;
	    
	}
	
}
