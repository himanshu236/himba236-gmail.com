
public class Task2 {
	public static void main(String[] args) {
		for(int i=0;i<=3;i++)
		{
			for (int j=0;j<=3;j++)
			{
				int k=i*j;
				if(k==1||k==2||k==4)
				{
					System.out.print(" ");
				}
				else 
					System.out.print("$");
			}
			System.out.println("");
		}
		
	}
}
