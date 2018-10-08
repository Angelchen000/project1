import java.util.Scanner;

public class Buy
	{

		public static void main(String[] args)
			{
				Juice.Juice1();
				System.out.println("welcome! what kind of Juice you want for today?");
				
				for (int i=0; i<Juice.Juice1.size();i++) {
					System.out.println(" Name: " + Juice.Juice1.get(i).getName()+" JuiceContain: " + Juice.Juice1.get(i).getJuiceContain()+" Price: "+ Juice.Juice1.get(i).getPrice());
				}
					 Scanner number  = new Scanner(System.in);
					 String drink = number.nextLine();
					 if(drink.equals())
					
					
				
				

			}

	}
