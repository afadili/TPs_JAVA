package fr.umlv.geom;
import java.lang.Math.*;
public class Ring extends Circle{
	private double inRayon;

	public Ring(Point pt, double r)
	{
		super(pt, r); // super permet d'appeler le constructeur parent (très pratique)
	}
	public Ring(Point centre, double ray, double inRay) throws Exception
	{
		this(centre, ray);
		if (inRay >= ray){
			throw new Exception("Rayon interne doit etre inférieur au rayon !");
		}
		this.inRay = inRayon;
	}
	@override
	public String toString(){
		return super.toString() + "Rayon interne :" + this.inRayon;
	}

}