//write a program to print multiplication table
import java.util.Scanner;

public class p_04_multiplicationTable {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int num = sc.nextInt();
      for (int i = 1; i <= 10; ++i) {
        System.out.printf("%d * %d = %d \n", num, i, num * i);
      }
    }
  }
}
