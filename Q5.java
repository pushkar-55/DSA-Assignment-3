public class Q5 {

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

    void displayFront() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front: " + queue[front]);
        }
    }

    void displayRear() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Rear: " + queue[rear]);
        }
    }

    public static void main(String[] args) {
        Q5 q = new Q5();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();

        q.enqueue(40);
        q.enqueue(50);

        q.display();
        q.displayFront();
        q.displayRear();
    }
}
