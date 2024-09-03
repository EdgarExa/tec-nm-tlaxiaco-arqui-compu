package numeros.binarios;

// Importa la clase Scanner que permite leer la entrada del usuario desde la consola
import java.util.Scanner;

/**
 * La clase Conversor contiene la lógica para convertir números
 * entre sistemas numéricos: decimal, binario, octal, y hexadecimal.
 */
public class Conversor {

    /**
     * El método main es el punto de entrada de la aplicación.
     * Aquí se despliega un menú para que el usuario seleccione el tipo de conversión que desea realizar.
     */
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Variable para almacenar la opción seleccionada por el usuario
        int opcion;

        // Bucle do-while que continúa mostrando el menú hasta que el usuario elija salir
        do {
            // Muestra las opciones del menú
            System.out.println("\nConversor de Números:");
            System.out.println("1. Decimal a Octal");
            System.out.println("2. Octal a Decimal");
            System.out.println("3. Decimal a Binario");
            System.out.println("4. Binario a Decimal");
            System.out.println("5. Decimal a Hexadecimal");
            System.out.println("6. Hexadecimal a Decimal");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            // Lee la opción seleccionada por el usuario
            opcion = scanner.nextInt();

            // Evalúa la opción seleccionada utilizando una estructura switch-case
            switch (opcion) {
                case 1:
                    // Conversión de decimal a octal
                    System.out.print("Ingrese un número decimal: ");
                    int decimal = scanner.nextInt(); // Lee un número decimal ingresado por el usuario
                    String octal = Integer.toOctalString(decimal); // Convierte el número decimal a octal
                    System.out.println("El número octal es: " + octal); // Muestra el resultado en octal
                    break;
                case 2:
                    // Conversión de octal a decimal
                    System.out.print("Ingrese un número octal: ");
                    String octalInput = scanner.next(); // Lee un número octal ingresado por el usuario
                    int decimalFromOctal = Integer.parseInt(octalInput, 8); // Convierte el número octal a decimal
                    System.out.println("El número decimal es: " + decimalFromOctal); // Muestra el resultado en decimal
                    break;
                case 3:
                    // Conversión de decimal a binario
                    System.out.print("Ingrese un número decimal: ");
                    decimal = scanner.nextInt(); // Lee un número decimal ingresado por el usuario
                    String binario = Integer.toBinaryString(decimal); // Convierte el número decimal a binario
                    System.out.println("El número binario es: " + binario); // Muestra el resultado en binario
                    break;
                case 4:
                    // Conversión de binario a decimal
                    System.out.print("Ingrese un número binario: ");
                    String binarioInput = scanner.next(); // Lee un número binario ingresado por el usuario
                    int decimalFromBinario = Integer.parseInt(binarioInput, 2); // Convierte el número binario a decimal
                    System.out.println("El número decimal es: " + decimalFromBinario); // Muestra el resultado en decimal
                    break;
                case 5:
                    // Conversión de decimal a hexadecimal
                    System.out.print("Ingrese un número decimal: ");
                    decimal = scanner.nextInt(); // Lee un número decimal ingresado por el usuario
                    String hexadecimal = Integer.toHexString(decimal); // Convierte el número decimal a hexadecimal
                    System.out.println("El número hexadecimal es: " + hexadecimal); // Muestra el resultado en hexadecimal
                    break;
                case 6:
                    // Conversión de hexadecimal a decimal
                    System.out.print("Ingrese un número hexadecimal: ");
                    String hexadecimalInput = scanner.next(); // Lee un número hexadecimal ingresado por el usuario
                    int decimalFromHexadecimal = Integer.parseInt(hexadecimalInput, 16); // Convierte el número hexadecimal a decimal
                    System.out.println("El número decimal es: " + decimalFromHexadecimal); // Muestra el resultado en decimal
                    break;
                case 0:
                    // Opción para salir del programa
                    System.out.println("Saliendo del conversor...");
                    break;
                default:
                    // Mensaje para opciones no válidas
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0); // Repite el ciclo hasta que el usuario elija salir

        // Cierra el objeto Scanner
        scanner.close();
    }
}