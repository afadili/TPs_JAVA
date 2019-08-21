import java.util.Arraylist;

public class Basket{

	Arraylist<FruitQuantity> fruits = Arraylist<FruitQuantity>();

	public Basket(){
		this.fruits = new Arraylist<FruitQuantity>();
	}

 	public void add(FruitQuantity a)
	{
		fruits.add(a);
	}

	public void add(FruitQuantity p, int n){
		assert n > 1 : "Erreur";
		p.setQuantity(n);
		this.fruits.add(p);
	}

	@override
	public String toString()
	{
		int price = 0;
		StringBuilder str = new StringBuilder();
		for(FruitQuantity fruit : fruits){
			str.append(fruit.toString());
			str.append(" x ");
			str.append(fruit.getQuantity());
			str.append("\n");
			price += fruit.getPrice() * fruit.getQuantity();	
		}
		str.append("Prix : "+ price);
		return str.toString();
	}
}