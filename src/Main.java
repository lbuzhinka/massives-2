public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] expenses =  {500, 1000, 2000, 3000, 2500};
        int sum = 0;
        for (int index = 0; index < expenses.length; index ++) {
            sum += expenses[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("\n Task 2");
        int minExpenses = Integer.MAX_VALUE;
        for (int i = 0; i < expenses.length; i++) {
        if (expenses[i] < minExpenses) {
            minExpenses = expenses[i];

        }
    }
        System.out.println("Минимальная сумма трат за месяц " + minExpenses + " рублей");
        int maxExpenses = -1;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
        }
        System.out.println("Максимальная сумма трат за месяц " + maxExpenses + " рублей");
        System.out.println("\n Task 3");
        double averageExpenses = 0;
        for (int index = 0; index < expenses.length; index ++) {
            averageExpenses = sum / (expenses.length);
        }
        System.out.println("Средний расход в месяц " + averageExpenses + " рублей");
        System.out.println("\n Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }



    }

}