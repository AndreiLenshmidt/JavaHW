import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) throws Exception {
        
        // Задача 1 - Дан произвольный список целых чисел, удалить из него четные
        ArrayList <Integer> randomNumbers = new ArrayList <Integer> ();
        Collections.addAll(randomNumbers, 10,3,12,5,8,4,9,-16,-3);
        deleteEven(randomNumbers);
    }

    public static void deleteEven (ArrayList <Integer> arrList) {
        
        Iterator <Integer> iterator = arrList.iterator();
        
        while(iterator.hasNext()){
            int item = iterator.next();
            if (item % 2 != 0) System.out.print(item + " ");
            else {
                iterator.remove();
            }
        }
    }
}

