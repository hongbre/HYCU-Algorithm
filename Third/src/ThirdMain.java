public class ThirdMain {
    public static void main(String[] args) {
        // queue 생성
        Queue<Integer> queue = new Queue<>();

        // queue에 data enqueue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // queue에 enqueue한 data 확인
        System.out.println(queue.getQueue());

        // queue에 dequeue 후 남은 data 확인
        System.out.println(queue.dequeue());
        System.out.println(queue.getQueue());

        // stack 생성
        Stack<Integer> stack = new Stack<>();

        // stack에 data push
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // stack에 push한 data 확인
        System.out.println(stack.getStack());

        // stack에 pop 후 남은 data 확인
        System.out.println(stack.pop());
        System.out.println(stack.getStack());
    }
}
