package fr.umlv.geom;

public class Main{
	public static void main(String[] args) {
	/*var point = new Point(1, 2);
    var circle = new Circle(point, 1);

    var circle2 = new Circle(point, 2);
    circle2.translate(1, 1);

    System.out.println(circle + " " + circle2);*/

    /*var p = new Point(1, 2);
    var c = new Circle(p, 1);
    c.getCenter().translate(1,1);
    System.out.println(p);*/

    var point = new Point(1, 2);
    var circle = new Circle(point, 2);
    System.out.println(circle);
    var ring = new Ring(point, 2, 1);
    System.out.println(ring);
    System.out.println("Success !");

	}
}


/*
Exercice 1:
1. Le code ne compile pas car il ne retrouve pas le fr.umlv.geom.Point.Main 
2. on doit déclarer ces deux champs en private ?
3. fait sur le code.
4. fait sur le code.
5. fait sur le code.
6. Le code affiche que les deux cercles ont le meme point en centre, ce qui n'est pas 
normal vu qu'on a fait un translate sur le deuxième, mais c'est la meme référence c'est
surement a cause de ça que le translate s'est appliqué sur le deuxième.
pour que cela n'arrive pas il ne faut pas utiliser le meme point parce qu'on aura du coup
la meme reference, il faut faire une copie du premier point.
7. il faut faire une copie du point
8. fait sur le code 
9. fait sur le code
10. Les ... dans la signature veulent juste dire qu'on peut mettre plusieurs objets au lieu
d'un seul.

Exercice 2:
1. il est judicieux de la faire quand on peut reprendre intégralement ce qu'onn a précédemment 
codé, pour réutiliser ce code là et optimiser ainsi notre code.
2. fait sur le code.
3. fait sur le code.
on retourne une exception dans le cas contraire.
4. 

*/
