/**
 * @author Alfredo Quezada
 * @author Juan Marroquin
 * Codigo tomado del libro de texto
 */
public interface iListas <E>  {
    /** Metodo que averigua el tamaño de la lista  
    */
   public void add(E item);
   //Agrega valor a la lista 
   
   public E getFirst();
   // regresa el primer valor de la lista 
   
   public E getLast();
   // regresa el valor del ultimo valor
   
   public E removeFirst();
   // elimina el primer valor de la lista
   
   public E removeLast();
   // elimina el ultimo valor de la lista 
   
   public boolean isEmpy();
   // verifica si la lista tiene elementos 
   
   public int size();
   // comprueba el tamaño de la lista 
}
