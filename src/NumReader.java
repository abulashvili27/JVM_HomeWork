import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumReader {

    private NumReader() {

    }

    public static int[] readFromFile(String file)
            throws IOException , InvalidNumberException {
        int[] nums = new int[10];
        int i =0;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null && i < 10) {
            try {
                int number = Integer.parseInt(line.trim());
                if (number < 0) {
                    throw new InvalidNumberException("Invalid number: " + number);
                }
                nums[i++] = number;
            } catch (NumberFormatException e) {
                System.out.println("Error parsing number: " + e.getMessage());
            }
        }
        reader.close();
        return nums;
    }

    public static int sumArray(int[] numbers)
            throws ArithmeticException {
        int sum = 0;
        try {
            for (int number : numbers) {
                sum += number;
                if (number == 0) {
                    throw new ArithmeticException("Division by zero error");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Null array");
        }
        return sum;
    }
}
