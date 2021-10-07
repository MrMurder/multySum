import java.util.Arrays;
import java.util.Scanner;
/*
A program that reads any amount of numbers separated with a space and prints the sum in the standard output.
If a user enters only a single number, the program print the same number.
If a user enters an empty line, the program ignore it.
When the command "/exit" is entered, the program print "Bye!" and then stop.
 */
public class multiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                continue;
            } else if (line.equals("/help")) {
                System.out.println("The program calculates the sum of numbers");
                continue;
            } else if (line.equals("/exit")) {
                System.out.println("Bye!");
                break;
            }
            String[] terms = line.split("\\s+");
            int[] numbers = Arrays.stream(terms).mapToInt(Integer::parseInt).toArray();
            System.out.printf("%d\n", Arrays.stream(numbers).sum());
        }
    }
}
