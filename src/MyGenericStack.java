import java.util.EmptyStackException;
import java.util.LinkedList;

import static jdk.nashorn.internal.objects.annotations.SpecializedFunction.LinkLogic.isEmpty;

public class MyGenericStack <T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }

    boolean isEmpty() {
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
}
