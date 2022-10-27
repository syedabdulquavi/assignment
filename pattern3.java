
public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||i==1&&j<n-8||i==n-2&&j<n-8||i==2&&j<n-9||i==n-3&&j<n-9||
						i==3&&j<n-10||i==n-4&&j<n-10||i==4&&j<n-11||i==n-5&&j<n-11||i==5&&j<n-12||i==n-6&&j<n-12||
						i==6&&j<n-13||i==n-7&&j<n-13)
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


