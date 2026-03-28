public class SinglyLinkedList<E> {
    public Node<E> head = null;

    /* 강의에서는 이렇게 하긴 했는데,
       Node Class를 별도로 작성해놓았으니 해당 Class 활용
    public class Node<E> {
        E data;
        Node<E> next = null;

        public Node(E data) {
            this.data = data;
        }
    }
    */

    public void addNode(E data) {
        if (head == null) {
            // List에 Node가 하나도 없을 때는 헤드 뒤에 노드 추가
            head = new Node<E>(data);
        } else {
            // List에 Node가 하나 이상 있을 때
            Node<E> node = this.head;

            // 마지막 노드를 찾을 때 까지 반복
            while (node.next != null) {
                node = node.next;
            }

            // 마지막 노드 뒤에 노드 추가
            node.next = new Node<E>(data);
        }
    }

    public void getAllNodeData() {
        if (head != null) {
            Node<E> node = this.head;
            System.out.println("node = " + node + ", data = " + node.data
                    + ", next = " + node.next);
            while (node.next != null) {
                node = node.next;
                System.out.println("node = " + node + ", data = " + node.data
                        + ", next = " + node.next);
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
                return true;
            } else {
                while(node.next != null) {
                    // 다음 Node의 값이 타겟과 같으면 next를 다음 Node로 설정 후 true
                    if (node.next.data == targetData) {
                        node.next = node.next.next;
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
