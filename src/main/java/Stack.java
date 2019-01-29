import java.lang.reflect.Array;

public class Stack<T> {

    private T[] stack;
    private int counter = 0;

    @SuppressWarnings("unchecked")
    public Stack(T type, int size) {
        stack = (T[]) Array.newInstance(type.getClass().getComponentType(), size);
    }


    public void push(T item) throws StackOverflow {
        if (stack.length == counter -1) {
            throw new StackOverflow();
        }
        stack[counter] = item;
        counter++;
    }


    public T pop() throws StackUnderflow {
        if (counter == 0) {
            throw new StackUnderflow();
        }
        T itemInQuestion = stack[counter];
        counter--;
        return itemInQuestion;
    }


    public T peek() {
        return stack[counter];
    }

}
