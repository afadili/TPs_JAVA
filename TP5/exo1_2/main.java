public class main{	
public static void main(String[] args) {
		var bob = new Robot("bob");
     	System.out.println(bob);  // affiche "Robot bob"

     	System.out.println("---------------COMBAT--------------------");
     	var D2R2 = new Robot("D2R2");
     	var data = new Robot("data");
     	var arena = new Arena();

     	System.out.println(arena.fight(D2R2, data));

	    System.out.println("---------------COMBAT HUMAIN----------------");

		var john = new Fighter("John", 1);
     	var jane = new Fighter("Jane", 2);
     	System.out.println(Arena.fight(john, jane) + " wins");	
		


	


     }
 }