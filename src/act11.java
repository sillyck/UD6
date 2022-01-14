import javax.swing.JOptionPane;

/**
 * @author Jordi Ribellas
 */
public class act11 {

	public static void main(String[] args) {
		
		String tamany = JOptionPane.showInputDialog("De que tamaño sera el array1?");
		int largo = Integer.parseInt(tamany);

		int array1[] = new int[largo];
		int array2[] = new int[largo];
		
		llenarArrayR(array1);
		
	}

	public static void llenarArrayR(int array[]) {
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int) (Math.random()*9);
		}
		
	}
	
	
	
	
	
	
	public static int[] agruparArrays(int array1, int array2) {
		
		int[] arrayMult[];
		return arrayMult[];
	}
}
