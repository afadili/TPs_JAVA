//package fr.umlv.calc;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    OpOrValue expression = new OpOrValue(OpOrValue.OP_ADD,
        new OpOrValue(2),
        new OpOrValue(3)
        );
    System.out.println(expression.eval());

    String input = "- + 4 5 2";
    Scanner operation = new Scanner(input);
    OpOrValue resultat = OpOrValue.parse(operation);
    System.out.println(resultat.eval());
  }
}