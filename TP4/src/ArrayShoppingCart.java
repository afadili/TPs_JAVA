import java.util.*;

public class ArrayShoppingCart   
{ 
    private book[] liste;
    final private int max;
    private int current;

// Consctructeur 
public ArrayShoppingCart(int MaxNum)
{
    current=0;
    max=MaxNum;
    liste = new book[MaxNum];
};

public void displayList()
{
    System.out.println("Nb de livres : " + current);
    for (int i=0; i < current; i++) 
    {
        System.out.println(liste[i].getAuthor() + " - " + liste[i].getTitle());
    }
   
}

 public void add(book book)
{
    if (current<max) 
    {
      liste[current]=book;
      current++;
    }
    else 
    {
        System.out.print("Liste pleine");
    }
};


public void longestTitle()
{
    String longest="";
    for (int i=0; i < current; i++) 
    {
        if (liste[i].getTitle().length() > longest.length())
        {
            longest=liste[i].getTitle();
        }
    }
    System.out.print("Le titre le plus long est : " + longest + "\n");
}
}


/*Exercice 2 : 
fait sur le code.
*/