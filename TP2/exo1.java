public class exo1{
	public static void main(String[] args) {
		var s1 = "toto";
       var s2 = s1;
       var s3 = new String(s1);

       System.out.println(s1 == s2);
       System.out.println(s1 == s3);

       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);

       var s4 = "toto";
       var s5 = new String(s4);

       System.out.println("s4 and s5 comparison: "+s4.compareTo(s5));

      var s6 = "toto";
      var s7 = "toto";

      System.out.println(s6 == s7);
      System.out.println("s4 and s5 comparison: "+s6.compareTo(s7));

      var s8 = "hello";
      s8.toUpperCase();
      System.out.println(s8);
	}
}

/* Exercice 1
1. le type de s est une variable string 
Le compilateur détecte que s est un string et avec le . devant s il trouve que 
s a une méthode length().

2. le code affiche : 
true
false

Explication : 
s1 == s3 affiche false parce que pour déclarer s3 on a utilisé un new string qui
force la class string à créer un nouvel objet string indépendant de s1, ce qui fait
que quand on les compare, on trouve false.

3. On utilise la méthode compareTo().

4. en java l'opérateur == est un opérateur d'égalité des références, là dans ce
cas s6 et s7 pointent vers le meme objet string "toto", c'est pourquoi ça retourne
true parce que ça pointe vers la meme référence.

5. Il est important que java.lang.String ne soit pas mutable pour plusieurs raisons :
 * pour permettre le partage de chaine litterale et pouvoir ainsi faire du string pool.
 * pour une question de sécurité aussi, si c'était mutable un utilisateur peut 
 par exemple avoir accès à un fichier particulier dans le système et en changeant le PATH
 accéder à un autre.
 * pour pouvoir faire du mutlithreading, en effet quand c'est immutable il n'y a pas de 
 synchronisation externe, donc parce que le string est immutable, on le partage simplement
 entre les threads et on a un code plus lisible.

6. ici on applique la méthode sur s8 mais on ne stocke pas ça dans une variable, donc
s8 ne change pas, il fallait la stocker dans un objet string car toUpperCase retourne 
un objet string.

*/