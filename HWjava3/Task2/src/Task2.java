import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) throws Exception {
               
        // Задача 2 - Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из списка
    
        ArrayList <Integer> randomNumbers = new ArrayList <Integer> ();
        Collections.addAll(randomNumbers, 10,3,22,5,8,4,9,-16,-3);
        findValues(randomNumbers);

    }

    public static void findValues (ArrayList <Integer> arrList) {
        Collections.sort(arrList);
        System.out.printf("Минимальное значение равно %d",arrList.get(0));
        System.out.println();
        System.out.printf("Максимальное значение равно %d", arrList.get(arrList.size()-1));
        System.out.println();

        Iterator <Integer> iterator = arrList.iterator();
        int sum = 0;
        while(iterator.hasNext()){
                sum += iterator.next();
        }
    
        double summ = sum;
        System.out.printf("Среднеарифметическое равно %.2f", summ/arrList.size());
    }
}

