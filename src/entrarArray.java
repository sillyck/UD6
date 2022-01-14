import javax.swing.JOptionPane;

/**
 * @author Jordi Ribellas
 */
public class entrarArray {
	
	public static void main(String[] args) {
		
		String tamany = JOptionPane.showInputDialog("De que tamaño sera el array?");
		int largo = Integer.parseInt(tamany);

		int array[] = new int[largo];
		
		llenarArray(array, largo);
		mostrarArray(array, largo);
		
	}
	
	public static int[] llenarArray(int array[], int largo) {
		
		for(int i=0; i<largo; i++) {
			array[i] = (int) (Math.random()*10);
			
		}
		
		return array;
		
	}
	
	public static void mostrarArray(int array[], int largo) {
	
		for(int i=0; i<largo; i++) {
			
			System.out.println(array[i]);
			
		}
		
	}
	

}
