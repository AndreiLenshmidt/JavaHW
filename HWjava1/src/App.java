import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Задача 1
        // int n = inputData();
        // System.out.println(sumNumbers(n));
        // System.out.println(factorial(n));
        // Задача 2
        // simpleDigits(1000);
        // Задача 3
        // String[] data = inputCalc(); 
        // System.out.println(data[1]);
        // System.out.println("Результат введенного выражения равен:");
        // System.out.println(calculator(data));
    }

    // Ввод числа n
    public static int inputData() {

        Scanner data = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = data.nextInt();
        data.close();

        return n;
    }

    // Ввод к задаче 3
    public static String [] inputCalc() {

        String [] arrayData = new String[3];
        Scanner data = new Scanner(System.in);
        System.out.println("Введите первое число Num1: ");
        arrayData[0] = data.nextLine();
        System.out.println("Введите операцию(+ - / *): ");
        arrayData[1] = data.nextLine();
        System.out.println("Введите второе число Num2: ");
        arrayData[2] = data.nextLine();
        data.close();

        return arrayData;
    }

    // Метод к задаче 1 - сумма
    public static int sumNumbers(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
    // Метод к задаче 1 - факториал
    public static int factorial(int n) {
        
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }

        return fact;
    }
    // Метод к задаче 2 
    private static void simpleDigits(int n) {

        int [] divider = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

        for (int item = 0; item < divider.length; item++) {
            System.out.println(divider[item]);
        }

        for (int i = 32; i < n; i++) {

            int count = 0;

            for (int j = 0; j < divider.length; j++) {
                if (i%divider[j] == 0) {
                    count ++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }
    }
    // Метод к задаче 3
    public static Double calculator(String [] data) {

        double result;
        
        if (data[1].equals("+")) {
            result = Double.parseDouble(data[0]) + Double.parseDouble(data[2]);
            return result;
        }
        else if (data[1].equals("-")) {
            result = Double.parseDouble(data[0]) - Double.parseDouble(data[2]);
            return result;
        }
        else if (data[1].equals("*")) {
            result = Double.parseDouble(data[0]) * Double.parseDouble(data[2]);
            return result;
        }
        else if (data[1].equals("/")) {
            result = Double.parseDouble(data[0]) / Double.parseDouble(data[2]);
            return result;
        }
        else {
            System.out.println("Невозможно произвести заданную операцию");
            return 0.0;
        }
    }
}
