import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        // В калькулятор добавьте возможность отменить последнюю операцию.
        
        String[] data = inputCalc(); 
        System.out.println("Результат введенного выражения равен:");
        System.out.println(calculator(data));
    }

    public static String [] inputCalc() {

        String [] arrayData = new String[3];
        Scanner data = new Scanner(System.in, "cp866");
        Boolean checkData = true;
        String checkStr = " ";
        while (checkData == true) {
            System.out.println("Введите первое число Num1: ");
            arrayData[0] = data.nextLine();
            System.out.println("Введите операцию(+ - / *): ");
            arrayData[1] = data.nextLine();
            checkStr = arrayData[1];
            checkData = escOperation(checkStr);
        }
        checkData = true;
        while (checkData == true) {
            if (checkStr.equals("отмена")) {
                System.out.println("Введите операцию(+ - / *): ");
                arrayData[1] = data.nextLine();
            }
            System.out.println("Введите второе число Num2: ");
            arrayData[2] = data.nextLine();
            checkStr = arrayData[2];
            checkData = escOperation(checkStr);
        }
        data.close();

        return arrayData;
    }

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

    public static boolean escOperation(String oparation) {
        if(oparation.equals("отмена")) {
            return true;
        }
        else {
            return false;
        }

    }
    
}
