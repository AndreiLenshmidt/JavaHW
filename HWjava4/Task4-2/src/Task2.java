import java.util.Deque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди,
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    // first() - возвращает первый элемент из очереди, не удаляя.
    Deque randomNumbers = new LinkedList ();
    Collections.addAll(randomNumbers, 10,3,22,5,8,4,9,-16,-3);
    System.out.println(randomNumbers);
    enqueue(inputData(),randomNumbers);
    dequeue(randomNumbers);
    first(randomNumbers);
    
    }

    public static String inputData() {
    
        Scanner data = new Scanner(System.in);
        System.out.print("Введите элемент: ");
        String item = data.nextLine();
        data.close();

        return item;
    }

    public static void enqueue(String item, Deque randomDeque) {
        randomDeque.addLast(item);
        System.out.println("Добавили элемент:");
        System.out.println(randomDeque);
    }
    
    public static void dequeue(Deque randomDeque) {
        System.out.println("Вернули первый элемент: "+ randomDeque.pollFirst());
        System.out.println(randomDeque);
    }

    public static void first(Deque randomDeque) {
        System.out.println("Вернули первый элемент без удаления: " + randomDeque.peekFirst());
        System.out.println(randomDeque);
    }
}
