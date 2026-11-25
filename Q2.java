public class Q2 {

    int[] queue = {10, 20, 30, 40, 50};
    int front = 0;
    int rear = 4;

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted Element: " + queue[front]);
            front++;
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
        Q2 q = new Q2();

        q.dequeue();
        q.display();
    }
}
