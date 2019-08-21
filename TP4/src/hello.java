public class hello{
	public hello(int foo) {
		super();
		this.foo = foo;
	}
	public static void main (String[]args) {
		System.out.println("Hello Eclipse ! ");
		a = 2+3+4;
	}
	int foo;
	public void setFoo(int foo) {
		this.foo = foo;
	}
	public int getFoo() {
		return foo;
	}
}

/* Exercice 1
 * 1. sysout + Ctrl + space : genère directement la ligne du System.out.println();
 * 2. toStr + Ctrl + space : génère directement le code de la méthode toString en override.
 * 3. get + Ctrl + space et set + Ctrl + space: génère automatiquement les codes du getter et setter du champs foo;
 * 4. Dans la barre de Menu, dans source on peut en plaçant le curseur dans la classe, générer un constructeur 
 * initialisant le champs foo directement en cliquant sur "Generate constructor using fields".
 * 5. avec Alt + Shift + R, on peux refactorer (changer) partout où il faut et en même temps le nom de la classe.
 * même chose pour le champs foo.
 * 6. en sélectionnant 2+3 et en faisant Alt + Shift + L on peut définir directement une nouvelle variable qui a cette valeur.
 * 7. Ctrl + 1 affiche Quick-fix errors.
 * 8. Ctrl en déclarant la variable String affiche le code déclarant la classe.
 * 9. Ctrl + Clic sur super.toString() affiche le code déclarant la méthode.
 * 10. select foo + Ctrl + Shift + G cherche les occurences de `foo` dans le projet.
 * 11. Ctrl + Shift + G nettoie les expressions d'imports.
*/