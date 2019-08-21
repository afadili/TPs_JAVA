import java.util.*;

public class main   
{ 

	public static void main(String[] args) 
	{
                
        var b1 = new book("Da Java Code", "Duke Brown");
        var b2 = new book("Le petit prince", "St. Ex");
        var panier1 = new ArrayShoppingCart(2); 
        panier1.add(b1);
        panier1.add(b2);
        panier1.displayList();
        panier1.longestTitle();

        var panierLibre = new FreeShoppingCart();
        panierLibre.add(b1);
        panierLibre.add(b2);
        panierLibre.longestTitleIndex();
        panierLibre.longestTitleIterator();
        panierLibre.longestTitleForEach();

	}
}