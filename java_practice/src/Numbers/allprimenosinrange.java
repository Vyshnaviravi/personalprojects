package Numbers;
public class allprimenosinrange {
	public static void main(String[]args) {
		int no=1, range=25; 
			for(int j=no;j<=range;j++) {
				no=j;
				boolean isprime=true;
				if(no<=1)
				{
					isprime=false;
				}
				else {
					for(int i=2;i<no;i++)
					{
						if(no%i==0) {
							isprime=false;
							break;
						}
					}
				}
				if (isprime) {
					System.out.println(no+" ");
				}
				}
			}

		}
	
