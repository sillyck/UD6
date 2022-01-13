/**
 * 
 * @author Jordi Ribellas
 */
import javax.swing.JOptionPane;
public class metodosiArraysApp {

	public static void main(String[] args) {
		
		String resposta = JOptionPane.showInputDialog("Que quieres calcular?");
		
		switch(resposta) {
			case "circulo":
				calcularCi(); // llama a la funcion calcularCi y va a la linea 27
			break;
			case "triangulo":
				calcularTr(); // llama a la funcion calcularTr y va a la linea 36			
			break;
			case "cuadrado":
				calcularCu(); // llama a la funcion calcularCu y va a la linea 48
			break;
		}
		
	}
	
	public static void calcularCi() { // este es el metodo que calculara el area del circulo
		String numero = JOptionPane.showInputDialog("Cual es el radio?"); // pedir el valor del radio
		double radio = Double.parseDouble(numero); // passar de string a double
		
		double resultadoCi = Math.pow(radio, 2)*Math.PI; // operacion
		
		System.out.println("El area de tu circulo és " + resultadoCi); // mostrar por pantalla el resultado
	}
	
	public static void calcularTr() { // este es el metodo que calculara el area del triangulo
		String bas = JOptionPane.showInputDialog("Cual es la base?"); // prdir la base
		double base = Double.parseDouble(bas); // passar de string a double
		
		String alt = JOptionPane.showInputDialog("Cual es la altura?"); // pedir la altura
		double altura = Double.parseDouble(alt); // passar de string a double
		
		double resultadoTr = (base * altura)/2; // operacion
		
		System.out.println("El area de tu triangulo és " + resultadoTr); // mostrar por pantalla el resultado
	}
	
	public static void calcularCu() { // este es el metodo que calculara el area del cuadrado
		String lad1 = JOptionPane.showInputDialog("Cual es el valor del primer lado?"); // pedir el primer lado
		double lado1 = Double.parseDouble(lad1); // passar de string a double
		
		String lad2 = JOptionPane.showInputDialog("Cual es el valor del segundo lado?"); // pedir el segundo lado
		double lado2 = Double.parseDouble(lad2); // passar de string a double
		
		double resultadoCu = lado1 * lado2; // operacion
		
		System.out.println("El area de tu cuadrado és: " + resultadoCu); // mostrar por pantalla el resultado
	}
		
	
}
