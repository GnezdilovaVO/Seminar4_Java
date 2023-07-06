// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя
public class LinkedList {
    int[] array;
    int top;

    public LinkedList(int size) {
        array = new int[size];
        top = -1;
    }

    public boolean empty() {

        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int first() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой");
        }
        return array[0];
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой");
        }
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        top--;
        return array[0];
    }

    // public void enqueue(int num) {
    // if (empty()) {
    // throw new IllegalStateException("Стек пустой");
    // }
    // array[array.length - 1] = num;
    // }

    public void enqueue(int num) {
        top++;
        array[top] = num;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(100);
        list.enqueue(5);
        list.enqueue(7);
        list.enqueue(3);
        list.enqueue(4);
        list.print();
        System.out.println(list.first());
        System.out.println(list.size());
        list.dequeue();
        System.out.println(list.first());
        list.print();
    }
}
