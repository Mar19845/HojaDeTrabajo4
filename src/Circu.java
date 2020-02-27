/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfredo Quezada
 * @author JuanMa Marroquin
 */

import java.util.List;


public class Circu<E> extends AbstractLista<E> {
    
    @Override 
    public void add(E item){
        
        data.add(item);
        
    }
    
    @Override 
    public E getFirst(){
        
        data.get(0);
        
    }
    
    @Override
	public E getLast() {
		
		return data.get(size()-1);
	}

	@Override
	public E removeFirst() {
		
		return data.remove(0);
	}

	@Override
	public E removeLast() {
		
		return data.remove(size() - 1);
	}

	@Override
	public boolean isEmpty() {
		
		return size() == 0;
	}

	@Override
	public int size() {

		return data.size();
	}
}
