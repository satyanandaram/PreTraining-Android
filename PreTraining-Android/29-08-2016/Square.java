class Square extends Shape 
{
	private double side;
	Square()
	{
		super();
	}
	Square(double side)
	{
		this.side=side;
	}
	Square(double side,String color,boolean filled)
	{
		super(color,filled);
		this.side=side;
	}
	public double getSide()
	{
		return this.side;
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public double getArea()
	{
		return getSide()*getSide(); 
	}
	public double getPerimeter()
	{
		return 4 *getSide();
	}
	public String toString()
	{
		return "Side of Square: "+this.getSide()+"\t Area of Square: "+this.getArea()+"\tPerimeter of Square: "+getPerimeter();
	}
}
