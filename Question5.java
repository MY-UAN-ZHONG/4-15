import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Question5 {
    public static void main(String[] args) {
        // Stack 模擬
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.push(30);
        System.out.println("Stack: " + stack);

        // Queue 模擬
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10); // enqueue
        queue.add(20);
        queue.poll(); // dequeue
        queue.add(30);
        System.out.println("Queue: " + queue);
        
        // 預期輸出: Stack: [10, 30]; Queue: [20, 30]
    }
}