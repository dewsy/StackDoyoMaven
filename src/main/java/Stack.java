import java.lang.reflect.Array;

public class Stack<T> {

    private T[] stack;
    private int counter = -1;

    @SuppressWarnings("unchecked")
    public Stack(Class<T> tClass, int size) {
        stack = (T[]) Array.newInstance(tClass, size);
    }


    public void push(T item) throws StackOverflow {
        if (stack.length == counter +1) {
            throw new StackOverflow();
        }
        counter++;
        stack[counter] = item;
    }


    public T pop() throws StackUnderflow {
        if (counter == -1){
            throw new StackUnderflow();
        }
        T itemInQuestion = stack[counter];
        stack[counter] = null;
        counter--;
        return itemInQuestion;
    }


    public T peek() {
        if (counter < 0) {
            return null;
        }
        return stack[counter];
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T i : stack){
            builder.append(i);
            builder.append(", ");
        }
        String stackString = builder.toString();
        return stackString.substring(0, stackString.length() -2);
    }
}
