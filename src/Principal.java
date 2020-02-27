import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *@author Alfredo Quezada
 * @author Juan Marroquin
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        Calculadora Calcu = new Calculadora();
	BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
	String linea = br.readLine();
        StackFactory f = new StackFactory();
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese el numero de la implementacion que desea utilizar: ");
	System.out.println("1. Lista Simple");
	System.out.println("2. Lista Doble");
	System.out.println("3. Lista Circular");
	System.out.println("4. Salir");
	int seleccion = teclado.nextInt();
        switch (seleccion) {
			case 1:
				iStack v = f.getStack("LS");
                                double a = Calcu.operar(linea, v);
                                System.out.println(a);
				break;
			case 2:
				v = f.getStack("LD");
                                a = Calcu.operar(linea, v);
                                System.out.println(a);
				break;
			case 3:
				v = f.getStack("LC");
                                a = Calcu.operar(linea, v);
                                System.out.println(a);
				break;
			case 4:
				System.out.println("Puede Retirarse");

				System.exit(0); 

				break;
			default:
				System.out.println("Porfavor Elija algo del menú: ");
		}

		

	}
}
