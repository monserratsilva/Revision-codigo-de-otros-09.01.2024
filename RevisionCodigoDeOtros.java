// FUNCION DEL CODIGO:
// 1. Solicita al usuario ingresar un numero
// 2. Analiza el numero ingresado por el usuario
// 3. En caso de que el numero ingresado sea 3, 7, 8 o 9, se imprime en consola "Es un numero afortunado"
// 4. En caso de que el numero ingresado no sea 3, 7, 8 o 9, se imprime en consola "No es un numero afortunado"


import java.util.Scanner;

public class RevisionCodigoDeOtros {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in); // Se crea un objeto llamado "s" para leer la entrada del usuario
	        System.out.print("Introduzca un número: "); // Se le solicita al usuario introducir un numero
	        String ni = s.nextLine(); // El numero ingresado se almacena en la variable ni
	        // Se quita "int c = ni" ya que no es correcto en java
	        
	        int afo = 0; // Se inicializa contador para afortunados
	        int noAfo = 0; // Se inicializa contador para no afortunados

	        // Se cambia WHILE por una funcion FOR
	        for (int i = 0; i < ni.length(); i++) { 
	            int digito = Character.getNumericValue(ni.charAt(i));
	            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
	                afo++;
	            } else {
	                noAfo++;
	            }
	        }
	        
	        // Se utiliza funcion IF para imprimir en cada uno de los casos

	        if (afo > noAfo) {
	            System.out.println("El " + ni + " es un número afortunado.");
	        } else {
	            System.out.println("El " + ni + " no es un número afortunado.");
	        } 
	        
	        s.close(); // Se agrega para cerrar el objeto "Scanner"
	    }
	}


