import java.lang.Integer;
import java.util.*;

   public class sum 
   {

   		public static int[] charToint(String[] strTab)
   		{
   			System.out.println("TABLEAU : ");	
   			int tab[] = new int[strTab.length];
   			for(int i = 0; i <= strTab.length-1; i++)
    			{
    				tab[i]= Integer.parseInt(strTab[i]);
   	   	    		System.out.println(tab[i]);	
   				}
   			return tab;
   		}

   		public static int sumArray(int[] tab)
   		{
   			int sum=0;
   			for(int i = 0; i <= tab.length-1; i++)
    			{
    				sum+=tab[i];
   				}
   			return sum;
   		}
	public static void main (String[] args){
	System.out.println("------- SOMME -------"+ System.getProperty("line.separator") + sumArray(charToint(args)));
	}
   }

// 2- Pour une méthode, static permet d'appeler une fonction sans avoir besoin d'instancier la classe dans une variable. 
/*pouvoir faire par exemple : 
Maclasse.fonction();

au lieu de : 
Maclasse f = new taclasse();
f.fonction();*/

// 3 - Lorsqu'un mot pris en argument n'est pas un nombre, Ça lance une exception. 
