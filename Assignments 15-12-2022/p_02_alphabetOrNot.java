// write a program to check whether a character is alphabet or not

import java.util.Scanner;

public class p_02_alphabetOrNot {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      char c = sc.next().charAt(0);

      if (c >= 'a' && c <= 'z') {
        System.out.println("Alphabet");
      } else if (c >= 'A' && c <= 'Z') {
        System.out.println("Alphabet");
      } else {
        System.out.println("Not Alphabet");
      }
    }
  }
}
