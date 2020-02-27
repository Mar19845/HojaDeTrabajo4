/**
 *@author Alfredo Quezada
 * @author Juan Marroquin
 * Codigo tomado del ejemplo proporcionado por Douglas en clase
 */
public interface iStack<E> {
    /**Metodo Push (Ingresa un elemento al Stack)
     * @param p
     */
    public void push(E p);
    /**Metodo Pop (Obtiene un elemento del Stack)
     * @return E
     */
    public E pop();
    /**Metodo que verifica si el stack esta lleno o vacío 
    * @return True or False 
    */
    public boolean isEmpty();
}
