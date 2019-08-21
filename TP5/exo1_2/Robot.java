// TODO : Revoir les packages en java 
public class Robot{
	String nom;
	int nbVies;

	Robot(String name){
		nbVies = 10;
		nom = name;
	}

     void fire (Robot rbt)
     {
     	rbt.nbVies -= 2;
     	System.out.println("Robot " + rbt.nom + " a été touché par le Robot " + this.nom + "!");
     }

     boolean isDead()
     {
     	if (this.nbVies>0)
     	{
     		return false;
     	}
     	return true;
     }

     @Override 

     public String toString()
	{
		return "Robot " + this.nom;
	} 
}


/* pour tout compiler il faut faire : javac *.java
pour rajouter le package A.B.C il faut avoir le fichier C dans le dossier B dans A
pour compiler il faut qu'on soit à la racine du projet

si on a un dossier project avec deux sous-dossiers a et b et dans a un sous-dossier ab
qui contient other.java et test.java puis dans le dossier b un main.java
On peut utiliser la commande suivante pour compiler : 
javac `find .-name *.java`
et puis pour executer : java b/main
*/