class Rectangle extends Shape 
{
	private double width;
	private double length;
	Rectangle()
	{
		super();
	}
	Rectangle(double width, double length)
	{
		this.width=width;
		this.length=length;
	}
	Rectangle(double width,double length,String color,boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getLength()
	{
		return this.length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getArea()
	{
		return getLength()*getWidth(); 
	}
	public double getPerimeter()
	{
		return 2 * (getLength() +getWidth());
	}
	public String toString()
	{
		return "Area of Rectangle: "+this.getArea()+"\nPerimeter of Rectangle: "+this.getPerimeter();
	}

}
