import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Массивы часть 2. Задача № 1");

        int[] summa = new int[5];
        summa[0] = 500;
        summa[1] = 400;
        summa[2] = 800;
        summa[3] = 250;
        summa[4] = 1250;
        double totalSumma = 0;
        for (int element : summa) {
            totalSumma += element;
        }
        {
            System.out.println("Сумма трат за месяц составила " + totalSumma + " рублей.");
        }
        System.out.println("Массивы часть 2. Задача № 2");
        double maxSum = 0;
        for (int i = 0; i < summa.length; i++) {
            if (summa[i] > maxSum) {
                maxSum = summa[i];
            }
        }
        double minSum = summa[0];
        for (int num : summa) {
            if (num < minSum) {
                minSum = num;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей, максимальная сумма трат за неделю составила " + maxSum + " рублей");

        System.out.println("Массивы часть 2. Задача № 3");
        double averageAmount = totalSumma / summa.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей.");

        System.out.println("Массивы часть 2. Задача № 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String result = "";
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            result = result + reverseFullName[i];
        }
        System.out.println(result);


    }
}