import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fourth {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Total tests?");
    int totalTests = scanner.nextInt();
    scanner.nextLine();
    List<String> listOfTestCases = new ArrayList<>();

    for (int i = 0; i < totalTests; i++) {
      System.out.println("Enter phrase: ");
      listOfTestCases.add(scanner.nextLine());
    }
    scanner.close();

    listOfTestCases.forEach(phrase -> {
      String firstPart = phrase.substring(0, phrase.length() / 2);
      String secondPart = phrase.substring(
        (phrase.length() / 2),
        phrase.length()
      );
      System.out.println(
        new StringBuilder(firstPart).reverse().toString() +
        new StringBuilder(secondPart).reverse().toString()
      );
    });
  }
}
