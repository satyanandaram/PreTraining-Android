import java.io.*;
class PersonDemo 
{
	public static void main(String[] args)throws IOException 
	{
		System.out.println("Hello World!");
		
		
		
		int k=0;
		System.out.println("Hello World!");
		do
		{
			System.out.println("*********** Welcome to Person Demo class\n **********\nSelect which Shape do you want\n");
			System.out.println("1.Person\t2.Student\t3.Staff:\nPlease give your option ( 1 or 2 or 3 ):\t");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine());
			if (n==1)
			{
				Person ram=new Person("Satya","RKValley");
				System.out.println(ram);
			}
			else if (n==2)
			{
				Student nanda=new Student("Satyananda","RKValley","Android",2016,20000);
				System.out.println(nanda);
			}
			else if (n==3)
			{
				Staff satya=new Staff("Satyanandaram N","RKValley","RGUKT",41667);
				System.out.println(satya);
			}
			else
				System.out.println("Please give correct option");
			System.out.println("\n\nDo you want to check another Person? --- \n-----Press 1 for continue or any number for exit");
			k=Integer.parseInt(br.readLine());
		}
		while (k==1);

	}
}
