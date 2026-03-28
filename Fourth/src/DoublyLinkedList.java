public class DoublyLinkedList<E> {
    public Node<E> head = null;
    public Node<E> tail = null;

    public void addNode(E data) {
        if (this.head == null) {
            // List에 Node가 하나도 없을 때는 헤드 뒤에 노드 추가
            this.head = new Node<E>(data);
            this.tail = this.head;
        } else {
            // List에 Node가 하나 이상 있을 때
            Node<E> node = this.head;

            // 마지막 노드를 찾을 때 까지 반복
            while (node.next != null) {
                node = node.next;
            }

            // 마지막 노드 뒤에 노드 추가
            node.next = new Node<E>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void getAllNodeData() {
        if (head != null) {
            Node<E> node = this.head;
            System.out.println("node = " + node + ", data = " + node.data
                    + ", next = " + node.next
                    + ", prev = " + node.prev);
            while (node.next != null) {
                node = node.next;
                System.out.println("node = " + node + ", data = " + node.data
                        + ", next = " + node.next
                        + ", prev = " + node.prev);
            }
        }
    }

    public boolean deleteNode(E targetData) {
        if (this.head == null) {
            // List에 Node가 하나도 없을 때는 삭제할게 없으니 false
            return false;
        } else {
            Node<E> node = this.head;
            if (node.data == targetData) {
                // 첫 번째 Node의 값이 타겟과 같으면 헤드를 다음 Node로 설정 후 true
                this.head = this.head.next;
                this.head.prev = null;
                return true;
            } else {
                while(node.next != null) {
                    // 다음 Node의 값이 타겟과 같으면 헤드를 다음 Node로 설정 후 true
                    if (node.next.data == targetData) {
                        if (node.next.next != null) {
                            node.next.next.prev = node.next.prev;
                            node.next = node.next.next;
                        } else {
                            node.next = null;
                        }
                        return true;
                    }

                    // 다르면 포인터만 이동
                    node = node.next;
                }
                // 타겟이 없으니 false
                return false;
            }
        }
    }
}
