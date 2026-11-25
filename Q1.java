public class Q1 {

    int[] queue = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            queue[rear] = value;
        }
    }

    void display() {
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q1 q = new Q1();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();
    }
}
