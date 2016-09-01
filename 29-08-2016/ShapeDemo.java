import java.io.*;
class ShapeDemo 
{
	public static void main(String[] args)throws IOException 
	{
		int k=0;
		System.out.println("Hello World!");
		do
		{
			System.out.println("*********** Welcome to Shape Demo class\n **********\nSelect which Shape do you want\n");
			System.out.println("1.Circle\t2.Rectangle\t3.Square:\nPlease give your option ( 1 or 2 or 3 ):\t");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine());
			if (n==1)
			{
				Circle obj=new Circle(1.5d,"Blue",true);
				System.out.println(obj);
			}
			else if (n==2)
			{
				Rectangle obj=new Rectangle(2.0d,4.0d);
				System.out.println(obj);
			}
			else if (n==3)
			{
				Square obj=new Square(3.0d);
				System.out.println(obj);
			}
			else
				System.out.println("Please give correct option");
			System.out.println("\n\nDo you want to check another Shape? --- \n-----Press 1 for continue or any number for exit");
			k=Integer.parseInt(br.readLine());
		}
		while (k==1);
	}
}
