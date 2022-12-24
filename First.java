import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class First {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Total Numbers?");
    int totalNumbers = scanner.nextInt();
    var numbers = new Integer[totalNumbers];

    for (int i = 0; i < totalNumbers; i++) {
      System.out.println("Enter position " + (i + 1));
      numbers[i] = scanner.nextInt();
    }

    scanner.close();
    List<Integer> list = Arrays.asList(numbers);
    Collections.sort(
      list,
      (x, y) -> {
        if (x % 2 == 0) {
          if (y % 2 == 0) {
            return x < y ? -1 : 1;
          } else {
            return -1;
          }
        } else if (y % 2 != 0) {
          return x < y ? 1 : -1;
        } else {
          return 1;
        }
      }
    );

    System.out.println("--- OUTPUT ---");
    list.forEach(System.out::println);
  }
}
