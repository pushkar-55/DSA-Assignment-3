public class Q3 {

    int[] queue = {15, 25, 35, 45, 55};
    int front = 0;
    int rear = 4;

    void getFront() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }

    public static void main(String[] args) {
        Q3 q = new Q3();

        q.getFront();
    }
}
