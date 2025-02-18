import java.util.Scanner;
public class main {
	public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
	public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
	public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };

	// Variables publicas extra que considereis

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String nombre, lugar;
		double cantidad;
		boolean seleccion = true;
		
		
		System.out.println("Buenos dias! Que quieres hacer hoy?");

		while (seleccion = true) {
			
		System.out.println("Que quieres hacer?: ");
		System.out.println("a. Buscar producto por nombre. ");
		System.out.println("b. Buscar producto por origen. ");
		System.out.println("c. Ordenar productos por precio de mayor a menor. ");
		System.out.println("d. Ordenar productos por precio de menor a mayor. ");
		System.out.println("e. Seleccionar varios productos. ");
		System.out.println("f. Eliminar el segundo producto de su carrito. ");
		System.out.println("g. Finalizar compra. ");
		System.out.println("h. Salir. ");


		
		
		System.out.println("Elige en nuestro menú una opción del 1 al 8: ");
		String opcion = scan.nextLine();
		
			while(!opcion.equals("a") || !opcion.equals("b") || !opcion.equals("c") || !opcion.equals("d") || !opcion.equals("e") || !opcion.equals("f") || 
					!opcion.equals("g") || !opcion.equals("h")) {
				
				System.out.println("Vuelve a repetir tu eleccion: ");
				System.out.println("a. Buscar producto por nombre. ");
				System.out.println("b. Buscar producto por origen. ");
				System.out.println("c. Ordenar productos por precio de mayor a menor. ");
				System.out.println("d. Ordenar productos por precio de menor a mayor. ");
				System.out.println("e. Seleccionar varios productos. ");
				System.out.println("f. Eliminar el segundo producto de su carrito. ");
				System.out.println("g. Finalizar compra. ");
				System.out.println("h. Salir. ");

				System.out.println("Elige otra vez en nuestro menú una opción del 1 al 8: ");
				opcion = scan.nextLine();
			}
		
		if(opcion.equals("a")) {
				
		}
		
		System.out.println("Usuario selecciona buscar por nombre");
		nombre = "Juana";
		// Codigo para buscar por nombre

		System.out.println("Usuario selecciona buscar por origen");
		lugar = "Andorra";
		// Codigo para buscar por origen

		System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
		// Codigo para ordenar de mayor a menor precio

		System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
		// Codigo para ordenar de mayor a menor precio

		System.out.println("Usuario selecciona varios productos para comprar");
		// Codigo para seleccionar primer producto
		nombre = "Hierba de los bosques";
		cantidad = 3;

		// Codigo para seleccionar segundo producto
		nombre = "El oro verde";
		cantidad = 1;

		// Codigo para seleccionar tercer producto
		nombre = "La seta feliz";
		cantidad = 2.5;
		
		System.out.println("Usuario elimina el segundo elemento de su carrito");
		// Codigo para eliminar elemento del carrito

		System.out.println("Usuario finaliza la compra");
		// Codigo para finalizar la compra y que salga el total de la compra
		
		}
	}
	
	//Funciones extra que considereis necesarias
}