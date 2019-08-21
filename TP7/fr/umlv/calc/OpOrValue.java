//package fr.umlv.calc;
import java.util.Scanner;

public class OpOrValue {
  public static final int OP_NONE = 0;
  public static final int OP_ADD = 1;
  public static final int OP_SUB = 2;
  
  private final int operator;
  private final int value;
  private final OpOrValue left;
  private final OpOrValue right;
  
  private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
    this.operator = operator;
    this.value = value;
    this.left = left;
    this.right = right;
  }
  public OpOrValue(int value) {
    this(OP_NONE, value, null, null);
  }
  public OpOrValue(int operator, OpOrValue left, OpOrValue right) {
    // a bug lies here
    this(operator, 0, left, right); 
  }
  
  public int eval() {
    switch(operator) {
    case OP_ADD:
      return left.eval() + right.eval();
    case OP_SUB:
      return left.eval() - right.eval();
    default: // case OP_NONE:
      return value;
    }
  }

  public static OpOrValue parse(Scanner scanner){
    if(!scanner.hasNext()){
      throw new IllegalArgumentException("Scanner vide !");
    }
    return parseRec(scanner);
  }

  private static OpOrValue parseRec(Scanner scanner)
  {
    if (!scanner.hasNext())
    {
      // problème 
    }
    var token = scanner.next();
    try {
      int i = Integer.parseInt(token);
      return new OpOrValue(i);
    }
    catch(NumberFormatException e)
    {
      var left = parseRec(scanner);
      var right = parseRec(scanner);
      switch(token)
      {
        case "+":
        return new OpOrValue(OP_ADD, left, right);
        case "-":
        return new OpOrValue(OP_SUB, left, right);
        default:
        throw new IllegalArgumentException("Ce n'est pas un opérateur valide !");
      }
    }
  }
}

/*
Exercice 1:
1. le constructeur qui prend 4 arguments est déclaré private, pour éviter
qu'il ne soit instancié par construction directe.
2. Le problème c'est qu'on a pas testé si left et right ne sont pas nuls
mais aussi on a pas determiné le type de l'opérateur
3. fait sur le code
4. fait sur le code
5.

*/




