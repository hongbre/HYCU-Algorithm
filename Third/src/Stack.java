import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> stack = new ArrayList<>();

    public void push(T data) {
        stack.add(data);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }

        return stack.removeLast();
    }

    public ArrayList<T> getStack() {
        return stack;
    }
}
