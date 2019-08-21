import java.util.regex.*; 

public class exo3
{
	public static void main(String[] args)
	{
        //les chaînes qui correspondent à des nombres, c'est-à-dire les chaînes dont tous les caractères sont compris entre '0' et '9
		System.out.println("Les nombres : ");
		for (String s : args) 
		{
			Pattern PatNumber = Pattern.compile("(\\D)");
			Matcher MatchNumber = PatNumber.matcher(s);
			if (!MatchNumber.find())
			{		
				System.out.print(s + " ");
			}
		}
        
        // affiches les chaînes de caractères qui commencent par des caractères qui ne sont pas des chiffres
		System.out.println(System.getProperty("line.separator") +"Les nombres où les mots où le dernier caractère est un nombre : ");
		for (String s : args) 
		{
			Pattern patt = Pattern.compile("\\d+$");
			Matcher lastMatch = patt.matcher(s);
			if(lastMatch.find()) 
			{
				System.out.print(s + "  ");
			}
		}

		System.out.println();
		System.out.println("les adresses IPv4 sont : ");
		for (String s : args) {
			
			Pattern Patt = Pattern.compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
			Matcher matches = Patt.matcher(s);
			boolean adresse = matches.matches();
			if (adresse) 
			{
			
			boolean Oct = true;
			for(int i=1; i <= matches.groupCount(); i++) 
			{
				if (Integer.parseInt(matches.group(i)) > 255) 
				{
				Oct = false;
				}
				System.out.print(s + "  ");
			}
			}
		}

	}
}

/*
1. Pattern est une classe de java.util.regex qui encapsule une expression régulière donnée (chaîne de caractères, 
écrite dans une syntaxe particulière, propre à la bibliothèque d'expressions régulières que l'on utilise) 
Cette classe a pour objet de compiler l'expression régulière fournie, c'est la méthode compile de cette classe qui
permet de le faire. 
la méthode Matcher permet de comparer une expression régulière à un texte et de faire différentes opérations dessus.

*/