/**
 * @author Jordi Ribellas
 */
import javax.swing.JOptionPane;
public class posicioIValor {

	public static void main(String[] args) {
		
		int num[]=new int[10];
		
		demanarNumeros(num);
		
	}
	
	
	public static void demanarNumeros(int num[]) {
		
		for(int i=0; i<10; i++) {
			
			String n = JOptionPane.showInputDialog("Quin numero vols introduir a la posició " + (i+1));
			int numero1 = Integer.parseInt(n);
			
			num[i] = numero1;
		}
		
		llistarNumeros(num);
		
	}
	
	public static void llistarNumeros(int num[]) {
		
		System.out.println("Posició - Valor");
		
		for(int i=0;i<10;i++) {
			
			System.out.println((i+1) + " - " + num[i]);
			
		}
		
	}
}
