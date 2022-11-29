import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] alphabets = {"A a", "B b", "C c", "D d", "E e", "F f", "G g", "H h", "I i", "J j", "K k", "L l", "M m",
                "N n", "O o ", "P p", "Q q ", "R r", "S s", "T t ", "U u", "V v", "W w", "X x", "Y y", "Z z"};

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try (FileWriter writer = new FileWriter("alphabets.txt")) {
            for (String alphabet : alphabets) {
                writer.write(alphabet + "\n");
            }
            for (int number : numbers) {
                writer.write(number + "\n");
            }
        }

        try {
            int counter = 0;
            FileReader fileReader = new FileReader("alphabets.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                counter++;
                System.out.println(counter + ": " + scanner.nextLine());
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}