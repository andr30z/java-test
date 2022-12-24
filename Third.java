import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Third {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Array size?");
    int arraySize = scanner.nextInt();
    System.out.println("Target value?");
    int targetValue = scanner.nextInt();

    var numbers = new Integer[arraySize];

    for (int i = 0; i < arraySize; i++) {
      System.out.println("Enter position " + (i + 1));
      int num = scanner.nextInt();
      numbers[i] = num;
    }
    scanner.close();

    List<Integer> list = Arrays.asList(numbers);

    int totalMatchValues = list
      .stream()
      .map(item -> {
        Long listOfSuccessfulOperations = list
          .stream()
          .filter(num -> (item - num) == targetValue)
          .count();
        return listOfSuccessfulOperations.intValue();
      })
      .reduce(0, Integer::sum);

    System.out.println(totalMatchValues);
  }
}
