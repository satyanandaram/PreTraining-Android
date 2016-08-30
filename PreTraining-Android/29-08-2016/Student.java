class Student extends Person
{
	String program;
	int year;
	double fee;
	Student(String name,String address,String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	String getProgram()
	{
		return this.program;
	}
	void setProgram(String program)
	{
		this.program=program;
	}
	int getYear()
	{
		return this.year;
	}
	void setYear(int year)
	{
		this.year=year;
	}
	double getFee()
	{
		return this.fee;
	}
	void setFee(double fee)
	{
		this.fee=fee;
	}
	public String toString()
	{
		return "Student [ Person [ name = "+this.name+", address = " +this.address+" ] Program = "+this.program+", year = "+ this.year+", fee = "+this.fee+" ]";
	}
}
