

public class Book{
	private String title;
	private String author = "<no author>";

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public Book(String t, String a){
		title = t;
		author = a;
	}

	public Book(String titre){
		title = titre;
	}
	@Override
	public void compareBooks(Book book){
		if( book instanceof Book){
		if ((this.title).compareTo(book.getTitle())==0 && (this.author).compareTo(book.getAuthor())==0)
		{
			System.out.println("Same books !");
		}
		else {
			System.out.println("Different books !");
			}
		}
	}
}

/*
2. on a créé un nouvel objet Book et les attributs sont initialisé à null c'est
pourquoi ça affiche "null null".

3. le problème c'est qu'on a déplacé le main dans un nouvelle classe, dans un nouveau
fichier qui ne connait pas du coup la class Book et ne peux finalement pas créer un 
nouvel objet book, ni afficher ses attributs.
pour régler ce problème il suffit d'enlever private des attributs et les rendre "package
friendly" et puisque les deux fichiers java sont dans le meme fichier il va automatiquement
les reconnaitre.

4. les 4 visibiltés possibles en java sont :
	private: visible qu'à l'intérieur de la classe.
	protected: visible par les classes héritées et celles du même package.
	public: visible par tout le monde.
	sans modificateur: visible par toutes les classes du même package.
Et il faut toujours déclarer ces champs en private pour respecter le principe de 
l'encapsulation, pour que ces champs ne soient accessible que par le biais des setters de la 
meme classe, et donc de protéger ces champs.

5. les accesseurs (getters) sont des fonctions qui permettent de récupérer la valeur 
d'une variable declarée "private" dans la classe.

6. Pour indiquer à un futur développeur que la valeur du champ title (ou author) ne doit 
pas être modifiée, il faut rajouter devant les champs "final" qui fait que la variable doit
etre initialisée une seule fois.
C'est important pour éviter d'accéder à des données qu'il ne faut pas toucher, et finalement
pour la protection des données.

7. Le code du main ne fonctionne plus car on a définit le constructeur en mettent des
parametres, du coup dans le main quand on fait "new book()" il faut lui donner les parametres.
Avant ça marchait, car on n'avait pas de contructeur, il a donc automatiquement utilisé un 
constructeur par défaut qui initialise tout les champs à "null", mais une fois qu'on a définit
nous meme notre constructeur, le constructeur par défaut n'est plus utilisé.

8. Le problème c'est que le compilateur confond du coup le title des attributs, et le title des 
parametres, et finit par tout initialiser à "null". La solution est donc d'utiliser un nom de 
variable différent pour les parametres.

9. fait sur le code directement.

10. le compilateur voit selon les parametres qu'on a donné au constructeur qu'on a appelé, c'est 
à dire que si on appelle un constructeur qui a pour parametre title et author, il appelle celui qui 
a pour argument title et author, sinon il appelle celui qui prend en parametre que title.

11. Pour faire ça il faut mettre dans le second contrcuteur un appel au premier avec this(argument).

-------------------------------------------------------------------------------------------------------
*/
/*Exercice 2 : 

1. Le code affiche : 
true
false 
et c'est parce que la comparaison se faire entre les instances mais pas entre les strings.

2. fait sur le code au dessus 

3. la méthode indexof retourne l'indice de la première occurence de l'élément spécifié, si l'élément 
n'est pas dans la liste, elle retourne -1.

4. Quand on éxecute on a l'erreur suivante : 

Note: Main.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

On a cette erreur ça on ne définit pas les types d'objets qu'on met dans le tableau.

5. indexOf appelle la méthode compareBooks().

8. l'annotation override sert à définir explicitement que l'on redéfinit une méthode.

10. il est préférable d'interdire une initialisation à null.

11. il faut faire : 
this.author = Objects.requireNonNull(author);
 Cette méthode sert à vérifier à chaque lecture de la variable que celle ci n'est pas nulle.
 	
*/
