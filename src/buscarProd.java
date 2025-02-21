import java.util.Scanner;

public class buscarProd {
	
	public static void buscProdNom (String [] hierba) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Que producto quieres buscar? ");
		String prod = scan.nextLine();
		boolean encontrado = false;
		
		for(int i = 0; i < hierba.length; i++) {
			if(hierba[i].contains(prod)) {
				System.out.println("Encontrado!");
				encontrado = true;
				
				if(encontrado == true) {
					System.out.print("Este es tu producto " + hierba[i]);
				}else if(encontrado == false) {
					System.out.println("No se ha encontrado tu producto :( " + hierba[i]);
				}
			}System.out.println();
		}if(encontrado == false) {
			System.out.println("No encontrado! ");
		}
		
	}
	
	public static void buscProdOrigen (String [] origen) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("De que origen quieres el producto ");
		String loc = scan.nextLine();
		boolean encontrado = false;
		
		for(int i = 0; i < origen.length; i++) {
			if(origen[i].equalsIgnoreCase(loc)) {
				System.out.println("Encontrado!");
				encontrado = true;
			}
		}if(encontrado == false) {
			System.out.println("No encontrado! ");
		}
		System.out.println("Tu producto procedente de " + loc);
	}
	
	public static void buscProdMayMen (double [] precio, String [] hierba) {
			for (int i = 0; i < precio.length; i++) {
				for (int j = i+1; j < precio.length; j++) {
					if (precio[i] < precio[j]) {
						double mayor = precio[i];
						precio[i] = precio[j];
						precio[j] = mayor;
		
						String nom = hierba[i];
						hierba[i] = hierba[j];
						hierba[j] = nom;
					}
				}
				System.out.println(hierba[i] + ": "+ precio[i]);
			}
			System.out.println("Estos son nuestros precios ordenados de mayor a menor.");
	}
	
	public static void buscProdMenMay (double [] precio, String [] hierba) {
		for (int i = 0; i < precio.length; i++) {
			for (int j = i+1; j < precio.length; j++) {
				if (precio[i] > precio[j]) {
					double mayor = precio[i];
					precio[i] = precio[j];
					precio[j] = mayor;
					
					String nom = hierba[i];
					hierba[i] = hierba[j];
					hierba[j] = nom;
				}
			}
			System.out.println(hierba[i] + ": "+ precio[i]);
		}
		System.out.println("Estos son nuestros precios ordenados de menor a mayor.");
	}
	
	public static void buscProdSelect (String [] hierba, int [] cantidades, String [] productos) {
		Scanner scan = new Scanner (System.in);
		boolean seguir = true;
		int contador = 0;
		
		while (seguir) {
			System.out.println("Que productos quieres seleccionar: ");
			String selec = scan.nextLine();
			
			boolean plantica = false;
			for (int i = 0; i < hierba.length; i++) {
				if(selec.equalsIgnoreCase(hierba[i])) {
					plantica = true;
					break;
				}	
			}
			while(!plantica) {
				System.out.println("No existe esta planta en nuestros huerticos, repite tu eleccion: ");
				selec = scan.nextLine();
				plantica = false;
				
				for(int i = 0; i < hierba.length; i++) {
					if(selec.equalsIgnoreCase(hierba[i])) {
						plantica = true;
						break;
					}
				}
			}
			
			System.out.println("Cantidad: ");
			int cantidad = scan.nextInt();
			scan.nextLine();
			
			boolean existe = false;
			for (int i = 0; i < contador; i++) {
				if (productos[i].equalsIgnoreCase(selec)) {
					cantidades[i] += cantidad;
					existe = true;
					break;
				} 
			}
			
			if (!existe) {
				productos[contador] = selec;
				cantidades[contador] = cantidad;
				contador++;
			}
			
				System.out.println("Quiere alguna plantita mas?: ");
				String planta = scan.nextLine();
				if (planta.equalsIgnoreCase("no")) {
					seguir = false;
				}
		
			}
		System.out.println("Estas son las hierbas que has seleccionado de nuestra exquisita seleccion: ");
		for(int i = 0; i < contador; i++) {
			System.out.println("Hierbica: " + productos[i] + " " + cantidades[i]);
		}
	}
	
	public static void buscProdElim (int[] cantidades, String [] productos) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Que producto desea eliminar?: ");
		String seleccion = scan.nextLine();
		
		for (int i = 0; i < productos.length; i++) {
			if (productos[i].equalsIgnoreCase(seleccion)) {
				productos[i] = null;
				cantidades[i] = 0;
				System.out.println("Producto eliminado");
			}else if(!productos[i].equalsIgnoreCase(seleccion)) {
				System.out.println("Producto eliminado");
			}
		}
	}

	public static void buscProdFin (String [] hierba, double [] precio, int [] cantidades, String [] productos) {
		
	}

	
}
