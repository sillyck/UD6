import javax.swing.JOptionPane;

public class act12App {

	public static void main(String[] args) {
		String tamany = JOptionPane.showInputDialog("De que tama�o seran las array?");
		int largo = Integer.parseInt(tamany);

		int array1[] = new int[largo];
		
		String ta = JOptionPane.showInputDialog("En que numero quieres que acaben los digitos mostrados?");
		int ends = Integer.parseInt(tamany);
		
		nrandom(array1);
		mostrarIndicats(array1, ends);
		
	}

	public static void nrandom(int a1[]) {
		
		for(int i=0; i<a1.length; i++) {
			int nrandom = (int) (Math.random()*300+1);
			a1[i] = nrandom;
		}
	}
	
	public static void mostrarIndicats(int a1[], int ends) {
		
		for(int i=0; i)
	}
}
