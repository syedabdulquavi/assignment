
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			      int n=14;
			        for(int i=0;i<n;i++)
			        {
			            for(int j=0;j<n;j++)
			            {
			                if(i==0||j==0||i==n-1||j==n-1||i==1&&j>n-7||i==1&&j<n-8||
			                i==2&&j>n-6||i==2&&j<n-9||i==3&&j>n-5||i==3&&j<n-10||
			                i==4&&j>n-4||i==4&&j<n-11||i==5&&j>n-3||i==5&&j<n-12)
			      
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




