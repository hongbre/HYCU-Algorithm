public class Node<E> {
    E data;
    Node<E> next = null;
    Node<E> prev = null;

    public Node(E data) {
        this.data = data;
    }
}
