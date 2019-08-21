public class Test
{
	public static void main(String[] args)
	{		
         var first = args[0];
         var second = args[1];
         var last = args[2];
         System.out.println(first + ' ' + second + ' ' + last);
       
	}
}

/* 4. On peut utiliser ' ' au lieu de " " parce que là il s'agit d'un espace qui est considéré comme un caractère.

   5. D'après la comparaison des deux bytecodes, on déduit que l'utilisation de append est plus optimisée que d'utiliser
   l'opérateur +.
*/