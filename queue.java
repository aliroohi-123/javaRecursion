import java.util.*;

public class queue {
    static class que {
        static int size = 4;
        static int rare;
        static int arr[];

        que(int size) {

            this.size = size;
            arr = new int[size];
            rare = -1;
        }

        public static boolean isEmpty() {
            return rare == -1;
        }

        public static void add(int data) {
            if (rare == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rare++;
            arr[rare] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rare; i++) {
                arr[i] = arr[i + 1];
            }
            rare--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        que q = new que(4);
        q.add(4);
        System.out.println(q.peek());

    }
}
