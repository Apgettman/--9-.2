import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        // ДЗ-9 Массивы ч.2
        // Задание 1
        int sum = 0;
        {
            int i = 0;
            while (i < arr.length) {
                sum += arr[i];
                i++;
            }
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей!");

        // Задание 2
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        {
            int i = 0;
            while (i < arr.length) {
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                }
                if (arr[i] < minSum)
                    minSum = arr[i];
                i++;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей." +
                " Максимальная сумма трат за день составила " + maxSum + " рублей!");
        // Задание 3
        int average = (int) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей!");

        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


