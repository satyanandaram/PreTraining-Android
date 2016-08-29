class Person 
{
	String name;
	String address;
	Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	String getName()
	{
		return this.name;
	}
	String getAddress()
	{
		return this.address;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return "Person[Name= "+this.name+", address = "+this.address+" ]";
	}
}
