public class Arena{

	public String fight(Robot rbt1, Robot rbt2)
	{
		while (!rbt1.isDead() && !rbt2.isDead())
		{
			if (!rbt1.isDead())
			{
				rbt1.fire(rbt2);
			}
			if (!rbt2.isDead())
			{
				rbt2.fire(rbt1);
			}
		}

		if (!rbt1.isDead())
		{
			return "Le Vainqueur est : " + rbt1.nom + "!";
		}
		else
		{
			return "Le Vainqueur est : " + rbt2.nom + "!";
		}
	}
}