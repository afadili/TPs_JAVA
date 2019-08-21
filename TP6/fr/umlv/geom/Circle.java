package fr.umlv.geom;

public class Circle{
	private Point centre;
	private int rayon;

	Circle(Point pt, int ray)
	{
		centre = pt;
		rayon = ray;
	}

	@Override
	public String toString()
	{
		return "Centre : " + this.centre + "\nRayon : " + this.rayon + "\nSurface : " + this.surface()+ "\n";
	} 

	public void translate(int dx, int dy)
	{
		centre.translate(dx,dy);
	}

	public double surface()
	{
		return (Math.PI * (rayon*rayon));
	}

	public Point getCenter()
	{
		return centre;
	}

	public boolean contains(Point p)
	{
		double x1 = p.getX() - this.getCenter().getX();
		double y1 = p.getY() - this.getCenter().getY();
		x1 = x1*x1;
		y1 = y1*y1;
		double dist = Math.sqrt(x1+y1);
		return dist <= this.rayon;
	}
}