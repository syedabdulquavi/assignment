

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n-1||i==n-2||i==n-3&&j<n-8||i==n-3&&j>n-7||i==n-4&&j<n-9||i==n-4&&j>n-6||i==n-5&&j<n-10||i==n-5&&j>n-5||i==n-6&&j<n-11||i==n-6&&j>n-4||i==n-7&&j<n-12||i==n-7&&j>n-3||i==n-8&&j<n-13||i==n-8&&j>n-2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


	}


