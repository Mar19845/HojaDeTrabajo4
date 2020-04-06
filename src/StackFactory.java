import java.util.Stack;
/**
 *
 * @author Juan Marroquin
 */
public class StackFactory<E>  {
    
    public iStack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	//if (entry.equals("AL"))
           // return new StackArrayList<E>(); //regresa ArrayList
        if (entry.equals("LS"))
            return new SimpleE<E>();
        else if (entry.equals("LD"))
            return new DobleE<E>();
        else if (entry.equals("LC"))
            return new Circu<E>();
        else
            return null;
   }
}
