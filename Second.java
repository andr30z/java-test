import java.util.Scanner;

public class Second {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Monetary value? Ex.: 576.73");
    //nextLine pra poder pegar o valor com ponto e nao com virgula
    float monetaryValue = Float.parseFloat(scanner.nextLine());
    scanner.close();
    int totalNotes = (int) monetaryValue;
    int coins = (int) ((monetaryValue - totalNotes) * 100);
    int totalNotes100 = totalNotes / 100;
    totalNotes -= totalNotes100 * 100;
    int totalNotes50 = totalNotes / 50;
    totalNotes -= totalNotes50 * 50;
    int totalNotes20 = totalNotes / 20;
    totalNotes -= totalNotes20 * 20;
    int totalNotes10 = totalNotes / 10;
    totalNotes -= totalNotes10 * 10;
    int totalNotes5 = totalNotes / 5;
    totalNotes -= totalNotes5 * 5;
    int totalNotes2 = totalNotes / 2;
    totalNotes -= totalNotes2 * 2;
    
    
    int coins1 = totalNotes;
    totalNotes -= coins1 * 1;
    int coins50 = coins / 50;
    coins -= coins50 * 50;
    int coins25 = coins / 25;
    coins -= coins25 * 25;
    int coins10 = coins / 10;
    coins -= coins10 * 10;
    int coins05 = coins / 5;
    coins -= coins05 * 5;
    int coins01 = coins;

    System.out.println("NOTAS:");
    System.out.println(totalNotes100 + " nota(s) de R$ 100.00");
    System.out.println(totalNotes50 + " nota(s) de R$ 50.00");
    System.out.println(totalNotes20 + " nota(s) de R$ 20.00");
    System.out.println(totalNotes10 + " nota(s) de R$ 10.00");
    System.out.println(totalNotes5 + " nota(s) de R$ 5.00");
    System.out.println(totalNotes2 + " nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(coins1 + " moeda(s) de R$ 1.00");
    System.out.println(coins50 + " moeda(s) de R$ 0.50");
    System.out.println(coins25 + " moeda(s) de R$ 0.25");
    System.out.println(coins10 + " moeda(s) de R$ 0.10");
    System.out.println(coins05 + " moeda(s) de R$ 0.05");
    System.out.println(coins01 + " moeda(s) de R$ 0.01");
  }
}
