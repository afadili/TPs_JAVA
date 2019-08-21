public class pascal{
	public static void main (String[] args){
		System.out.println(" Cn, p = %d\n" + (pascal (30000, 250)));
	}

	public static int pascal (int nBut, int pBut){
       int tab[] = {};
       int n, i;

       if(tab==null){
         System.out.println("Pas assez de place\n");
       }

       tab[0] = 1;

       for(n=1; n<=nBut; n++){
         tab[n] = 1;

         for(i=n-1; i>0; i--)
           tab[i] = tab[i-1] + tab[i];
       }

       int result=tab[pBut];
       tab = null;
       return result;
    }
}

/* le temps d'exécution est différent car selon le language avec lequel le programme
est codée, le typage est différent*/