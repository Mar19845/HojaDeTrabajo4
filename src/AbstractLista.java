/**
 * @author Alfre Quezada
 * @author Juan Marroquin
 * Clase abstracta que representa la lista 
 * codigo tomado del libro
 * @param <E>
 */

import java.util.List;


public abstract class AbstractLista <E> implements iListas<E> {
    
    public abstract void add(E item);
    //agrega valor a la lista
    
    public abstract E getFirst();
    // obtiene el valor del primero de la lista
    
    public abstract E getLast();
    //obtiene el valor del ultimo de la lista
    
    public abstract E removeFirst();
    //elimina el primero de la lista
    
    public abstract E removeLast();
    // elimina el ultimo de la lista 
    
    public abstract boolean isEmpty();
    // verifica si la lista tiene contenido 
    
    public abstract int size();
    // numero de elementos en la lista
  

}
    
    

