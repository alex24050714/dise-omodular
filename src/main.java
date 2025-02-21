import java.util.Scanner;
public class main {
	public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
	public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
	public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };
	public static String[] productos = new String[4];
	public static int[] cantidades = new int[4];

	// Variables publicas extra que considereis

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String nombre, lugar;
		double cantidad;
		boolean seleccion = true;
		
		
		System.out.println("Buenos dias! Que quieres hacer hoy?");

		while (seleccion) {
			
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
		
			while(!(opcion.equals("a") || opcion.equals("b") || opcion.equals("c") || opcion.equals("d") || opcion.equals("e") || opcion.equals("f") || 
					opcion.equals("g") || opcion.equals("h"))) {
				
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
		
		if(opcion.equalsIgnoreCase("a")) {
			buscarProd.buscProdNom(hierba);
		}
		else if(opcion.equalsIgnoreCase("b")) {
			buscarProd.buscProdOrigen(origen);
		}
		else if(opcion.equalsIgnoreCase("c")) {
			buscarProd.buscProdMayMen(precio, hierba);
		}
		else if(opcion.equalsIgnoreCase("d")) {
			buscarProd.buscProdMenMay(precio, hierba);
		}
		else if(opcion.equalsIgnoreCase("e")) {
			compraProd.buscProdSelect(hierba, cantidades, productos);
		}
		else if(opcion.equalsIgnoreCase("f")) {
			compraProd.buscProdElim(cantidades, productos);
		}
		else if(opcion.equalsIgnoreCase("g")) {
			compraProd.buscProdFin(hierba, precio, cantidades, productos);
		}
		else if(opcion.equalsIgnoreCase("h")) {
			seleccion = false;
		}
				
		}
	}
}