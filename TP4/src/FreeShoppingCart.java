import java.util.*;

public class FreeShoppingCart   
{ 
    ArrayList<book> listeBooks;

//Consctructeur 
    public FreeShoppingCart()
    {
        this.listeBooks = new ArrayList<book>();
    };

    public void add(book book)
    {
       this.listeBooks.add(book);
    };

    public void longestTitleIndex() 
    {	
		String longest = "";
		book bk;
        for (int i=0; i<this.listeBooks.size(); i++) 
        {
            if (this.listeBooks.get(i).getTitle().length() > longest.length()) 
            {
				longest = this.listeBooks.get(i).getTitle();
				bk = this.listeBooks.get(i);
			}
        }
        System.out.print("Longest title (en utilisant index) est : " + longest + "\n");
    }

    public void longestTitleIterator() 
    {	
        String longest = "";
        book b = null;
        Iterator<book> it = this.listeBooks.iterator();
        while(it.hasNext())
        {
			book tmp = it.next();
            if (tmp.getTitle().length() > longest.length())
            {
				longest = tmp.getTitle();
				b = tmp;
			}
		}
        System.out.print("Longest title (en utilisant iterator) est : " + longest + "\n");
    }

    public void longestTitleForEach() 
    {
        String longest ="";
        book b = null;
        for(book tmp : this.listeBooks) 
        {
            if (tmp.getTitle().length() > longest.length()) 
            {
                longest = tmp.getTitle();
                b = tmp;
            }
        }
    System.out.print("Longest title (en utilisant foreach) est : " + longest);
    }

    public void removeFirstOccurenceIterator(book b) 
    {
        Iterator<book> it = listeBooks.iterator();
        while (it.hasNext()) 
        {
            if (it.next().equals(b)) 
            {
                it.remove();
                break;
            }
        }
    }

    public void removeFirstOccurence(book book) 
    {
        this.listeBooks.remove(book);
    }

}

/* Exercice 3 : 
1. pour enlever le warning il suffit de spécifier le type book dans cette arraylist.
4. fait sur le code.
5. la complexité de cette méthode dans le pire cas est 0(n).
7. Il faut utiliser le forach quand on veut parcourir pour chaque élément pour trouver un élément qu'on cherche, 
par contre on utilise un iterator quand on ne cherche pas un élement en particulier
*/