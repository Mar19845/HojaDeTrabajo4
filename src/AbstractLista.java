/**
 * @author Alfre Quezada
 * @author Juan Marroquin
 * Clase abstracta que representa la lista 
 * codigo tomado del libro
 * @param <E>
 */
public abstract class AbstractLista <E> implements iListas<E> {
    /**
    * Constructor de la clase 
    */
    public AbstractLista(){
    }
    /* 
    * @see Lista#isEmpty()
    */
    @Override
    public boolean isEmpty(){
        // post: returns true iff list has no elements
        return size() == 0;
    }
}
