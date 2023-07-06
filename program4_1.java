// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;
public class program4_1 {
    public static void main(String[] args) {
        int count = 10;
        LinkedList<Integer> data = fillLinkedList(count);
        System.out.println(data);
        System.out.println(turnLinkedList(data));

    }
    public static LinkedList<Integer> fillLinkedList(int size) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random()*100));
        }
        return list;
    }
    public static LinkedList<Integer> turnLinkedList(LinkedList<Integer> data) {
        LinkedList<Integer> turnData = new LinkedList<Integer>();
          for (int i = (data.size()-1); i >= 0; i--) {
            turnData.add(data.get(i));
        }
        return turnData;
    }
}
