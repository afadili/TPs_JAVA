public class PrintArgs{
	public static void main (String[] args){
			for (int i=0; i<args.length; i++)
			{
				System.out.println(args[i]);
			}
	}
}

/* 1 - j'ai testé dans un premier temps d'afficher le premier argument avec le fichier testexo2.java
et quand j'ai essayé de l'executer sans passer d'argument, j'ai eu une erreur : 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at testexo2.main(testexo2.java:3)
*/ 
	
/*public class PrintArgs{
	public static void main (String[] args){
		for (String arg : args)
				System.out.println(arg);

	}
}*/