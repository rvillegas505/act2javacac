package act2javacac;

import java.util.Scanner;

public class MostrarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		Integer edad;
		String hobbie;
		String editorFav;
		String so;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Ingrese su nombre y apellido");
		nombre = scan.nextLine();
		
		System.out.println("Ingrese su edad");
		edad = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Ingrese su Hobbie");
		hobbie = scan.nextLine();
		
		System.out.println("Ingrese su editor de codigo preferido");
		editorFav = scan.nextLine();
		
		System.out.println("Ingrese el Sistema Operativo que utiliza");
		so = scan.nextLine();
		
		
		System.out.println("\n Su nombre es: " +  nombre + "\n Su edad Es: " + edad + 
				"\n Su Hobbie Es: " + hobbie + "\n Su editor de código favorito es: " + editorFav +
				"\n El Sistema Operativo que utiliza es: " + so);
		
		
	}

}
