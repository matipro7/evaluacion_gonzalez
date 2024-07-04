package evaluacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class evaluacion {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		List <Integer> camiseta = new ArrayList <>();
		List <String> nombre = new ArrayList <>();
		
	camiseta.add(5);
	camiseta.add(10);
	camiseta.add(7);
	camiseta.add(9);
	camiseta.add(3);
	
	nombre.add("fernandez");
	nombre.add("medina");
	nombre.add("zeballos");
	nombre.add("cavani");
	nombre.add("rojo");
	
	int contrasena = 2007;
	
	System.out.println("ingrese la contraseña (numeros): ");
	int intento = entrada.nextInt();
	
	while ( intento != contrasena ) {
		
		System.out.println("Contrasena incorrecta, intente denuevo: ");
		intento = entrada.nextInt();
	
	}
	
	 for (int i = 0; i < (camiseta.size() - 1); i++) {
		for (int j = 0; j < (camiseta.size() - i - 1); j++) {
			if (camiseta.get(j) > camiseta.get(j + 1)) {
			
				int temporalNumero = camiseta.get(j);

				int SegundoElementoNumero = camiseta.get(j + 1);

				camiseta.set(j, SegundoElementoNumero);
				camiseta.set(j + 1, temporalNumero);

				
				String temporalString = nombre.get(j);

				String SegundoElementoString = nombre.get(j + 1);

				nombre.set(j, SegundoElementoString);
				nombre.set(j + 1, temporalString);
}	
}
}
	System.out.println("Numero de jugador a buscar: ");
	int numeroingresado = entrada.nextInt();
	
	for (int i= 0; i <camiseta.size(); i++ )
	
		
		if (numeroingresado == camiseta.get(i)) {
		
	 System.out.println("su nombre es: " + nombre.get(i));
	 System.out.println("su numero de camiseta es: " + camiseta.get(i));
	 
	 		System.out.println("Desea modificar su apellido? (S/N):" );
	 		char decision = entrada.next().charAt(0);
	 		
	 			if (decision == 'S' || decision == 's'  ) {
	 			
	 			System.out.println("ingrese el nuevo apellido: ");
	 			String nuevoapellido = entrada.next();
	 			
	 			nombre.set(i, nuevoapellido);
	 			
	 			System.out.println("Sus datos quedaron asi: ");
	 			System.out.println("Camiseta: "+ camiseta.get(i));
	 			System.out.println("Apellido: "+ nombre.get(i));
	 			}
	 			
	 			else if (decision == 'n' || decision == 'N' ){
	 				
	 				
	 			}
	 			
	 			
	 				else {
	 				
	 				System.out.println("ingresó una opción incorrecta");
	 		}
		
					
	}		
				System.out.println("Programa Finalizado...");
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
