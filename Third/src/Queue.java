import java.util.ArrayList;

public class Queue<T> {
    private final ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T data) {
        queue.add(data);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }

        return queue.removeFirst();
    }

    public ArrayList<T> getQueue() {
        return queue;
    }
}
