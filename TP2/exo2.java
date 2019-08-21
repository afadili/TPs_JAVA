public class exo2{
	public static void main(String[] args) {
		/*for (int i=0; i<args.length; i++)
			{
				System.out.print(args[i] + " Stop. ");
			}
			System.out.println();*/
			StringBuilder newStr= new StringBuilder();
			for (String item : args) 
   			{
  			     newStr.append(item).append(" Stop. ");		
			}
			System.out.println(newStr);
	}
}

/* Exercice 2 :
1. La classe StringBuilder fait partie du package java.lang . Cette classe
permet de créer et de manipuler les données de chaînes de manière dynamique, 
c'est-à-dire qu'on peut créer des variables de chaîne modifiables.

2. la méthode append(string) renvoie un string builder pour que ce que ça 
retourne ça soit mutable et qu'on puisse l'utiliser autant de fois qu'on veut.

3. L'avantage d'utiliser un StringBuilder est que l'on peut utiliser la méthode
append autant que l'on veux, sans faire de copie.

4. dans le fichier test.java

*/