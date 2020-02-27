/**
 * @author Alfredo Quezada
 * @author Juan Marroquin
 * @param <E>
 */
public abstract class AbstractStack <E>{
    //Esta es la clase abstracta que recibe a la interfaz que implementa los métodos del stack
    /**Método que recibe el parametro P (ingresa un elemento)
    * @param p
    **/
    public void push(E p){
    }
    /**Método de pop del Stack Devuelve un elemento 
    * @return null 
    */
    public E pop(){
        return null;
    }
    /**Método que verifica que el stack este lleno o vacio 
    * @return false 
    */
    public boolean isEmpty(){
        return false;
    }
}
