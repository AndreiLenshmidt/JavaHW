import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) throws Exception {
        
        // Задача1 - Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
        LinkedList <Integer> randomNumbers = new LinkedList <Integer> ();
        Collections.addAll(randomNumbers, 10,3,22,5,8,4,9,-16,-3);
        System.out.println(listItaratorPrev(randomNumbers));
    }


    public static Object listItaratorPrev(LinkedList arrList) {
        
        ListIterator listIterator = arrList.listIterator();
        listIterator = arrList.listIterator(arrList.size());
        
        LinkedList reverse = new LinkedList ();

        while(listIterator.hasPrevious()){
            reverse.add(listIterator.previous());
        }

        return arrList;
    }
}


