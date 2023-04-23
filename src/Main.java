import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = NumReader.readFromFile("numbers.txt");
            System.out.println("Numbers read from file: " + Arrays.toString(numbers));
            int sum = NumReader.sumArray(numbers);
            System.out.println("Sum of numbers: " + sum);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (InvalidNumberException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error calculating sum: " + e.getMessage());
        }
    }
}