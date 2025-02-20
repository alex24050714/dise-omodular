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
			double depositar = 0;
			for (int i = 0; i < precio.length; i++) {
				for (int j = i+1; j < precio.length; j++) {
					if (precio[i] < precio[j]) {
						double mayor = precio[i];
						precio[i] = precio[j];
						precio[j] = mayor;
					}
				}
				depositar = precio[i];
			}
			System.out.println("Aqui esta nuestro catalogo de hierbas ordenado de mayor a menor: ");
			System.out.println(depositar);
	}
	
	public static void buscProdMenMay (double [] precio) {
		for (int i = 0; i < precio.length; i++) {
			for (int j = i+1; j < precio.length; j++) {
				if (precio[i] > precio[j]) {
					double mayor = precio[i];
					precio[i] = precio[j];
					precio[j] = mayor;
				}
			}
			System.out.println(precio[i]);
		}

	}
	
	public static void buscProdSelect (String [] hierba, int [] cantidades, String [] productos) {
		
	}
	
	public static void buscProdElim (String [] hierba, double [] precio, String [] productos) {
		
	}

	public static void buscProdFin (String [] hierba, double [] precio, int [] cantidades, String [] productos) {
		
	}

	
}
