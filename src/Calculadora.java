
import java.util.Scanner;

/**
 *@author Alfredo Quezada
 * @author Juan Marroquin
 * Patron de diseño singleton sacado del video 
 * https://www.youtube.com/watch?v=mWwj7g_-DXA
 */
public class Calculadora implements Icalculadora{
    /**
     * atributos calculadora
     */
    public int operador1;
    public int operador2;
    /**
     * objeto de tipo calculadora para implementar el singleton
     */
    private static Calculadora Calcu;
    /**
    *constructor privado para implentar el singleton
    **/
    private Calculadora() {}
    /**
     * getter para el singleton
     * si el objeto calculadora es nulo crea un objeto calculadora
     * asi si, se crea otro objeto de tipo calculadora siempre retornara el mismo
     * @return 
     */
    public static Calculadora getCalculadora() {
        if(Calcu == null){
            Calcu = new Calculadora();
        }
        return Calcu;
    }
    /**
     * metdodo suma, suma dos valores y devuelve el resultado
     * @param operador1
     * @param operador2
     * @return 
     */
    @Override
    public int Sumar(int operador1, int operador2) {
        int resultado = 0;
        resultado = operador1 + operador2;
        return resultado;
        
    }
    /**
     * metodo resta, resta dos valores y devuelve el resultado
     * @param operador1
     * @param operador2
     * @return 
     */
    @Override
    public int Restar(int operador1, int operador2) {
        int resultado = 0;
        resultado = operador1 - operador2;
        return resultado;
    }
    /**
     * metodo multiplcar, multiplica dos valores y devuelve el resltado
     * @param operador1
     * @param operador2
     * @return 
     */
    @Override
    public int Multiplicar(int operador1, int operador2) {
        int resultado = 0;
        resultado = operador1 * operador2;
        return resultado;
    }
    /**
     * metodo dividir, divde dos valores y devuelve el resultado
     * debe de comprobar que el divisor no sea 0
     * @param operador1
     * @param operador2
     * @return 
     */
    @Override
    public int Dividir(int operador1, int operador2) {
        int resultado = 0;
        resultado = operador1 / operador2;
        return resultado;
    }
    public double operar(String n, iStack v){
        Scanner leer = new Scanner(n);
        while (leer.hasNext()) {
			if (leer.hasNextInt()) {
				v.push(leer.nextInt());
			} else {
				int n2 = (int) v.pop();
				int n1 = (int) v.pop();
				String op = leer.next();

				if (op.equals("+")) {
					v.push(n1 + n2);
				} else if (op.equals("-")) {
					v.push(n1 - n2);
				} else if (op.equals("*")) {
					v.push(n1 * n2);
				} else {
					v.push(n1 / n2);
				}

			}
		}
		double a = (int) v.pop();
		return a;
    }
}
