import java.util.Random ;

public class Fighter extends Robot
{ 
	Random random; 

	public Fighter(String name, int seed)
	{
		super(name);
		this.random = new Random(seed);
	}  
@Override
	public String toString() 
	{
     return("Fighter : " + name);
  	}	


@Override
  	public void fire(Robot rbt)  
  	{
		if(random.nextBoolean())
			super.fire(rbt);
		else
			System.out.println(this + " a raté sa cible !");
	}  	

/*
Exercice 2 : 

1. un générateur pseudo-aléatoire est un algorithme qui génère une séquence de nombres présentant certaines propriétés du hasard. 
et la graine (seed) est un nombre employé pour produire une suite pseudo aléatoire plus longue au fur et à mesure.

2. fait sur le code.

3. Pour respecter le principe de l'encapsulation qui est un principe très important dans le programmation 
orientée objet dans le sens où le code serait plus propre, et si quelqu'un est amené à réutiliser mon code
il peut le faire sans modifier le mien ...

4. 
5.
6.
7. fait sur le main.
8. fait sur le code.
9. le sous-typage est quand une classe hérite d'un autre, comme ici par exemple fighter hérite de Robot, elle a du coup les 
mêmes attributs de Robot .
Le polymorphisme est le fait de substituer à l'éxecution un appel de méthode par un autre en fonction de la classe du receveur.
ici par exemple, on a la classe fighter qui récupère grace à l'héritage toutes les méthodes de Robot, mais grace au principe du
polymorphisme redéfinit les méthodes (tostring et fire par exemple) d'une manière différente que sur Robot. 

*/



}