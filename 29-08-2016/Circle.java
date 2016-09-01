class Circle extends Shape 
{
	private double radius;
	Circle()
	{
		super();
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color, boolean isFilled)
	{
		super(color,isFilled);
		this.radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return Math.PI*getRadius()*getRadius(); 
	}
	public double getPerimeter()
	{
		return 2 * Math.PI*getRadius();
	}
	public String toString()
	{
		return "Area of Circle: "+this.getArea()+"\nPerimeter of Circle: "+this.getPerimeter();
	}
}
