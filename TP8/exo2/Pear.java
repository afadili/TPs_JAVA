public class Pear extends FruitQuantity {
    public final int FacteurJus;

	public Pear(int FacteurJus) {
		assert FacteurJus >= 0 && FacteurJus <= 9 : "Erreur : Facteur de Jus doit être entre 0 et 9 !"; 
		this.FacteurJus = FacteurJus;
		this.setQuantity(1);
	}

	@Override
	public int price() {
		return this.FacteurJus * 3;
	}

	@Override
	public String toString() {
		return "Poire [FacteurJus=" + FacteurJus + "]";
	}
}