public class FourthMain {
    public static void main(String[] args) {
        // Node 구현 테스트
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);

        node1.next = node2;
        node2.next = node3;

        Node<Integer> head = node1;

        System.out.println("head = " + head);
        System.out.println("node1 = " + node1 + ", data = " + node1.data + ", next = " + node1.next);
        System.out.println("node2 = " + node2 + ", data = " + node2.data + ", next = " + node2.next);
        System.out.println("node3 = " + node3 + ", data = " + node3.data + ", next = " + node3.next);

        // SinglyLinkedList 구현 테스트
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(5);

        /*
        System.out.println("singlyLinkedList Node1 = " + singlyLinkedList.head.data);
        System.out.println("singlyLinkedList Node2 = " + singlyLinkedList.head.next.data);
        */

        System.out.println("===== 싱글 노드 목록 =====");
        singlyLinkedList.getAllNodeData();

        System.out.println("===== 싱글 중간 노드 삭제 =====");
        singlyLinkedList.deleteNode(3);
        singlyLinkedList.getAllNodeData();

        System.out.println("===== 싱글 첫(head) 노드 삭제 =====");
        singlyLinkedList.deleteNode(1);
        singlyLinkedList.getAllNodeData();

        System.out.println("===== 싱글 마지막(tail) 노드 삭제 =====");
        singlyLinkedList.deleteNode(5);
        singlyLinkedList.getAllNodeData();

        System.out.println("===== 싱글 없는 노드 삭제 =====");
        singlyLinkedList.deleteNode(6);
        singlyLinkedList.getAllNodeData();

        // DoublyLinkedList 구현 테스트
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        doublyLinkedList.addNode(1);
        doublyLinkedList.addNode(2);
        doublyLinkedList.addNode(3);
        doublyLinkedList.addNode(4);
        doublyLinkedList.addNode(5);

        /*
        System.out.println("doublyLinkedList = " + doublyLinkedList.head.data
                + ", next = " + doublyLinkedList.head.next
                + ", prev = " + doublyLinkedList.head.prev);
        System.out.println("doublyLinkedList = " + doublyLinkedList.head.next.data
                + ", next = " + doublyLinkedList.head.next.next
                + ", prev = " + doublyLinkedList.head.next.prev);
        System.out.println("doublyLinkedList = " + doublyLinkedList.head.next.next.data
                + ", next = " + doublyLinkedList.head.next.next.next
                + ", prev = " + doublyLinkedList.head.next.next.prev);
        */

        System.out.println("===== 더블 노드 목록 =====");
        doublyLinkedList.getAllNodeData();

        System.out.println("===== 더블 중간 노드 삭제 =====");
        doublyLinkedList.deleteNode(3);
        doublyLinkedList.getAllNodeData();

        System.out.println("===== 더블 첫(head) 노드 삭제 =====");
        doublyLinkedList.deleteNode(1);
        doublyLinkedList.getAllNodeData();

        System.out.println("===== 더블 마지막(tail) 노드 삭제 =====");
        doublyLinkedList.deleteNode(5);
        doublyLinkedList.getAllNodeData();

        System.out.println("===== 더블 없는 노드 삭제 =====");
        doublyLinkedList.deleteNode(6);
        doublyLinkedList.getAllNodeData();
    }
}
