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
	
	public static void buscProdMayMen (double [] precio) {
		
	}
	
	public static void buscProdMenMay (double [] precio) {
		
	}
	
	public static void buscProdSelect (String [] hierba, int [] cantidades, String [] productos) {
		
	}
	
	public static void buscProdElim (String [] hierba, double [] precio, String [] productos) {
		
	}

	public static void buscProdFin (String [] hierba, double [] precio, int [] cantidades, String [] productos) {
		
	}

	
}
