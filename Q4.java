public class Q4 {

    int[] queue = {5, 10, 15, 20, 25};
    int front = 0;
    int rear = 4;

    void getRear() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Rear Element: " + queue[rear]);
        }
    }

    public static void main(String[] args) {
        Q4 q = new Q4();

        q.getRear();
    }
}
