import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import HWjava6.lib.Laptop;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Создается ArrayList ноутбуков, чтобы вынести конструирование экземпляров в отдельный метод
        ArrayList<Laptop> laptopArray = new ArrayList<>();
        // Создается словарь для выбора категории
        Map<Integer,String> choiseMap = new HashMap<>();
        // Вызывется добавление экземпляров 
        addClassExamp(laptopArray);
        // Выводит на экран начальный текст
        startInterface();
        // Создается сканнер для считывания выбора пользователя
        Scanner scan = new Scanner(System.in, "cp866");
        // Создается переменная значение - true которой переданное в метод userChoiseScanner закроет сканнер
        boolean closeScanner = false;
        // Сохраняется выбор категории пользователем
        int categoryNum = userChoiseScanner(closeScanner, scan);
        // Выводятся только уникальные подкатегории
        TreeSet<Object> subCategoruSet = secondChoise(categoryNum, laptopArray, choiseMap);
        // Сохраняется выбор подкатегории пользователем
        String secondUserChoise = secondInterface(subCategoruSet, scan, closeScanner);
        // Выводится список подходящих по критериям ноутбуков и их характеристики
        filterForUserChoise(laptopArray, choiseMap, categoryNum, secondUserChoise);

    }
    // Метод который добавляет в ArrayList<Laptop> laptopArray экземпляры класса
    public static ArrayList<Laptop> addClassExamp(ArrayList<Laptop> laptopArray) {
        
        Laptop Acer001 = new Laptop("Acer1",4, "SSD", 250, "Celeron", 2, 2.8, "Intel HD Graphix", "-", 0, "IPS", 14, "Нет");

        Laptop Acer002 = new Laptop("Acer2",8, "SSD", 500, "Celeron", 2, 2.8, "Intel HD Graphix", "-", 0, "IPS", 14, "Есть");

        Laptop Acer003 = new Laptop("Acer3",8, "HDD", 1000, "Celeron", 2, 2.8, "Intel HD Graphix", "-", 0, "IPS", 14, "Есть");

        Laptop Acer004 = new Laptop("Acer4",12, "SSD", 1000, "Celeron", 2, 2.8, "Intel HD Graphix", "-", 0, "IPS", 18, "Есть");

        Laptop Asus001 = new Laptop("Asus1",8, "HDD", 1000, "AMD Athlon", 4, 3.0, "Vega", "-", 0, "IPS", 16, "Есть");

        Laptop Asus002 = new Laptop("Asus2",8, "SSD", 500, "AMDRyzen3", 4, 3.4, "Geforce 1650", "GDDR5", 4, "Amoled", 16, "Есть");

        Laptop Asus003 = new Laptop("Asus3",16, "SSD", 1000, "AMDRyzen5", 6, 3.7, "Geforce 1660", "GDDR6", 6, "Amoled", 16, "Есть");

        Laptop Lenovo001 = new Laptop("Lenovo1",6, "SSD", 250, "AMDRyzen3", 4, 3.4, "Geforce 1660", "GDDR6", 6, "Amoled", 17, "Есть");

        Laptop Lenovo002 = new Laptop("Lenovo2",16, "SSD", 250, "AMDRyzen7", 8, 3.8, "Geforce 3060", "GDDR6", 12, "Amoled", 21, "Есть");

        Collections.addAll(laptopArray, Acer001, Acer002, Acer003, Acer004, Asus001, Asus002, Asus003, Lenovo001, Lenovo002);

        return laptopArray;
    }
    // Стартовый текст в консоли
    public static void startInterface() {
        makeSpaceLine();
        System.out.println("Выберите категорию для фильтрации ноутбуков:");
        System.out.println("Название ноутбука - 1;\nОбъем оперативной памяти - 2;\nТип накопителя - 3;\nПроцессор - 4;\nВидеоката - 5;\nМатрица - 6;\nДиагональ - 7;\nВебкамера - 8");
    }
    // Вызывает сканер для добавления пользовательского выбора
    public static int userChoiseScanner(boolean closeScanner, Scanner scan) {
        makeSpaceLine();
        System.out.print("Ваш выбор: ");
        int choise1 = scan.nextInt();
        if (closeScanner)
        scan.close();
        return choise1;
    }
    // Метод, который заполняет Мар данными и создает TreeSet<Object>, удаляя тем самым повторяющиеся элементы на основании выбора пользователя
    public static TreeSet<Object> secondChoise(int userChoise1, ArrayList<Laptop> laptopArray, Map<Integer,String> choiseMap) {

        choiseMap.put(1, "laptopName");
        choiseMap.put(2, "ram");
        choiseMap.put(3,"SSD");
        choiseMap.put(4,"processorName");
        choiseMap.put(5,"videoCardName");
        choiseMap.put(6,"matrix");
        choiseMap.put(7,"screen");
        choiseMap.put(8,"webCamera");

        TreeSet<Object> ramSet = new TreeSet<>();
        
        for (int i = 0; i < laptopArray.size(); i++) {
            
            if (!isInteger(laptopArray.get(i).getInformation(choiseMap.get(userChoise1)))) {
                ramSet.add(String.valueOf(laptopArray.get(i).getInformation(choiseMap.get(userChoise1))));
            }
            else {
                ramSet.add(Integer.parseInt(laptopArray.get(i).getInformation(choiseMap.get(userChoise1))));
            }

        }

        return ramSet;
    }
    // Выводит список подкатегорий на экран и возвращает пользовательский выбор подкатегории
    public static String secondInterface(TreeSet<Object> subCategory, Scanner scan, boolean closeScanner) {
        
        makeSpaceLine();
        System.out.println("Выберите подкатегорию: ");

        Iterator<Object> iter = subCategory.iterator();
        int count = 1;
        Map<Integer,String> subChoiseMap = new HashMap<>();
        while (iter.hasNext()){ 
            var iteration = iter.next();
            subChoiseMap.put(count, String.valueOf(iteration));
            System.out.println(iteration + " - " + count);
            count++;
        }

        int subCategoryNum = userChoiseScanner(closeScanner = true, scan);

        String userChoise2 = subChoiseMap.get(subCategoryNum);

        return userChoise2;
    }
    // Выводит список ноутбуков на основании выбора категории и подкатегории
    public static void filterForUserChoise(ArrayList<Laptop> laptopArray, Map<Integer,String> choiseMap, int categoryNum, String secondUserChoise) {
        
        makeSpaceLine();

        for (int i = 0; i < laptopArray.size(); i++) {
            if (laptopArray.get(i).getInformation(choiseMap.get(categoryNum)).equals(secondUserChoise)) {
                laptopArray.get(i).showLaptopInformation();
                makeSpaceLine();
            }
        }
    }
    // Создает пустую строку в консоле
    public static void makeSpaceLine() {
        System.out.println();
    }
    // Проверяет строку на конвертацию в Integer
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
