public class book   
{ 
	
	private final String title; 
	private final String author; 

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}
	public book(String titre, String auteur)
	{
	    title = titre;
	    author = auteur;
    }        
	public book(String titre)
	{
	    title = titre;
	    author = "<no author>";
    }  

    public void compareBooks(Book book2)
    {

    	if ((this.title).compareTo(book2.getTitle())==0 && (this.author).compareTo(book2.getAuthor())==0)
    	{
	   	 	System.out.println("same books");
    	}
    	else 
    	{
    		System.out.println("different books");
    	}

    }

    @Override
	public boolean equals(Object o) 
	{
		return (o instanceof Book &&
				this.getTitle().equals(((Book) o).getTitle()) &&
				this.getAuthor().equals(((Book) o).getAuthor()));
		
	}
	
	@Override
	public String toString()
	{
		if (!author.equals("<no author>")) {
			return "ERROR";
		};
		return title + " by " + author;
	}
}