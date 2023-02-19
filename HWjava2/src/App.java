import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) {

        // Задача 1 - Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.
        
        // int [] myArray = {8,24,15,0,11,4,6,5,19};
        // arraySort(myArray);
        
        // Задача 2 - Дана строка (получение через обычный текстовый файл!!!)
        // Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
        // Студент [фамилия] получил [оценка] по предмету [предмет].

        // String path = "task2.txt";
        // lineReader(path);

        // Задача 3 - Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

        // System.out.println(isPallindrome("12345321"));

    }

    // Лог задача 1
    public static void log(int [] array) {
        
        File file = new File("log.txt");
        try{
            FileWriter writer = new FileWriter(file,true);
            writer.write(Arrays.toString(array));
            writer.write("\n");
            writer.close();
            System.out.println("Выполнено");
        }
        catch (Exception e){
            System.out.println("Ошибка");
        }
    }
    // Сортировка массива задача 1
    public static void arraySort(int [] array) {
        
        int temp;

        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array.length; j++) {
                if (array[j-1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            
            }
            log(array);
        }

        System.out.println(Arrays.toString(array));
    }
    // --------------------------------------------
    // Чтение из файла задача 2
    public static void lineReader(String path) {

        try{
            FileReader journal = new FileReader(path);
            BufferedReader reader = new BufferedReader(journal);
            String line = reader.readLine();
            while (line != null) {
                
                String lineUTF = new String(line.getBytes("windows-1251"),"UTF-8");
                String[] mark = lineUTF.split("\"");

                strBuf(mark);
              
                line = reader.readLine();
            }
            journal.close();
        }
        catch (Exception e){
            System.out.println("Ошибка");
        }
    }
    // Создание и вывод строки (Студент "Фамилия" получил "Оценка" по предмету "Предмет") задача 2
    public static void strBuf(String [] array) {
        
        StringBuffer sbuf = new StringBuffer();
                String student = "Студент";

                sbuf.append(student)
                    .append(" ")
                    .append(array[3])
                    .append(" ")
                    .append("получил ")
                    .append(array[7])
                    .append(" ")
                    .append("по предмету ")
                    .append(array[11]);

                System.out.println(sbuf); 
    }
    
    // Проверка строки на полиндром задача 3
    public static boolean isPallindrome(String text) {

        StringBuffer sbuf = new StringBuffer(text);
        sbuf = new StringBuffer(text);
        String textReverse = sbuf.reverse().toString();

        if (text.equals(textReverse)) return true;
        else {
            return false;
        }

    }
}




// 4*. К калькулятору из предыдущего дз добавить логирование.