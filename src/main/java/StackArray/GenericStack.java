package StackArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E>  {
    private E[] elements;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[0];
    }

    @SuppressWarnings("unchecked")
    public void push(E item){
        E[] elements2 = (E[]) new Object[elements.length + 1];
        for(int i = 0; i < elements.length; i++){
            elements[i] = elements2[i];
        }
        elements2[elements.length-1] = item;
    }

    public E pop(){
        if(elements.length < 1){
            
        }
        return ;
    }

    public boolean isEmpty(){

    }
}
