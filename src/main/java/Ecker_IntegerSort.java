import java.util.Scanner;

public class Ecker_IntegerSort {

    public static void main(String[] args) {
        int[] numbers;
        int[] sortedNumbers;

        numbers = input();
        sortedNumbers = sortNumbers(numbers);
        output(sortedNumbers);
    }

    private static void output(int[] sortedNumbers) {
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(sortedNumbers[i]);
        }
    }

    private static int[] sortNumbers(int[] numbers) {
        int smallest = 0;
        int smallestID = 0;
        int[] sortedNumbers = new int[3];

        for (int i = 0; i < sortedNumbers.length; i++) {
            for (int y = 0; y < numbers.length; y++) {
                if (y == 0) {
                    smallest = numbers[y];
                    smallestID = y;
                } else if (numbers[y] < smallest && numbers[y] != -1) {
                    smallest = numbers[y];
                    smallestID = y;
                } else if (smallest == -1) {
                    smallest = numbers[y];
                    smallestID = y;
                }
            }
            sortedNumbers[i] = smallest;
            numbers[smallestID] = -1;
        }

        return sortedNumbers;
    }

    private static int[] input() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Unsortierte Nummern: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + 1 + ". Number: ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }
}
