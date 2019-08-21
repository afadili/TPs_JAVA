import java.util.Objects;

enum type {
	Golden, Pink Lady, GrannySmith
}

public class Apple{
	private type name;
	private int poid;
	private int quantity;

	private String getName() {
		String name = null;
		switch (name) {
		case Golden:
			name = "Golden";
			break;
		case PinkLady:
			name = "Pink Lady";
			break;
		case GrannySmith:
			name = "Granny Smith";
			break;
		}
		return name;
	}

	int getPoid(){
		return poid;
	}

	double getPrice(){
		return poid/2;
	}

	int getQuantity(){
		return quantity;
	}

	public Apple(int weight, String nom){
		poid = Objects.requireNonNull(weight);
		type = nom;
		this.quantity = 1;		
	}

	@override
	public String toString()
	{
		return name + " " + poid + " g x " + quantity;
	}
}