import java.util.Scanner;

public class compraProd {

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
				
					System.out.println("Quiere alguna plantita mas? si/no: ");
					String planta = scan.nextLine();
					while(!planta.equalsIgnoreCase("si") && !planta.equalsIgnoreCase("no")) {
						System.out.println("La eleccion tiene que ser si o no, no te motives fumeta: ");
						planta = scan.nextLine();
					}
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
			boolean eliminado = false;
			
			System.out.println("Que producto desea eliminar?: ");
			String seleccion = scan.nextLine();
			
			for (int i = 0; i < productos.length; i++) {
				if (productos[i] != null && productos[i].equalsIgnoreCase(seleccion)) {
					productos[i] = null;
					cantidades[i] = 0;
					System.out.println("Producto eliminado");
					eliminado = true;
				}
			}
			if (!eliminado) {
				System.out.println("Producto no encontrado: ");
			}
			System.out.println();
		}

		public static void buscProdFin (String [] hierba, double [] precio, int [] cantidades, String [] productos) {
			int productosFinal = 0;
			double precioFinal = 0;
			
			for (int i = 0; i < productos.length; i++) {
				if (productos[i] != null) {
					productosFinal += cantidades[i];
					for (int j = 0; j < hierba.length; j++) {
						if (productos[i].equalsIgnoreCase(hierba[j])) {
							precioFinal += precio[j] * cantidades[i];
							break;
						}
					}
				}
			}
			System.out.println("Esta es la cantidad de productos que has seleccionado agricultor: " + productosFinal);
			System.out.println("Y este es el precio de tus planticas: " + precioFinal);
		}
	}
