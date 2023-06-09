import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int foundEven = -1;

    while (true) {
      int number = scanner.nextInt();

      if (number < 0) {
        break;
      }

      if (number % 2 == 0) {
        if (foundEven == -1 || number < foundEven) {
          foundEven = number;
        }
      }
    }

    System.out.println(foundEven);
  }
}
