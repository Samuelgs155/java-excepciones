package control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CuadradoNumero {
	
	Scanner teclado;
	int numero;

	/**
	 * Realizar la carga de un número entero por teclado e imprimir su cuadrado.
	 * @param args
	 */
	public static void main(String[] args) {
		CuadradoNumero cn = new CuadradoNumero();
		cn.cargar();
		

	}
	
	public void cargar() {
		teclado = new Scanner(System.in);
		try {
            System.out.print("Ingrese un valor entero:");
            numero = teclado.nextInt();
            int cuadrado = numero * numero;
            System.out.print("El cuadrado de " + numero + " es " + cuadrado);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        }
	}

}
