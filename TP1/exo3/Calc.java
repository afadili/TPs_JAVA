import java.util.Scanner; 

public class Calc { 
	public static void main(String[] args) {
		Scanner scanner; /* variable de type Scanner */
		scanner = new Scanner(System.in);
		int value1= scanner.nextInt(); /* variable de type entier */
		int value2= scanner.nextInt();
		System.out.println("somme = "+ (value1+value2));
		System.out.println("différence = "+ (value1-value2));
		System.out.println("produit = "+ (value1*value2));
		System.out.println("quotient = "+ (value1/value2));
		System.out.println("reste = "+ (value1%value2));
	}
}

/* nextInt() n'est pas une fonction, c'est une méthode qui récupère
le contenu de toute la ligne saisie et replace la « tête de lecture » 
au début d'une autre ligne*/

/* la ligne "import java.util.Scanner;" permet d'importer le package
java.util qui contient la classe Scanner qu'on va utiliser dans la 
suite de notre programme*/

