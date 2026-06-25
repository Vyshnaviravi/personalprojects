package Numbers;
public class primeornot {
public static void main(String[]args) {
	int no=2;
	boolean f=true;
	if(no<=1) {
		f=false;
	}
	else {
		for(int i=2;i<=Math.sqrt(no);i++) {
			if(no%i==0) {
				f=false;
				break;		
				}
			    }
     		    }
	if(f)
	{
		System.out.println(no+" is Prime");
	}else {
		System.out.println(no+" is not a Prime");
	}
}
}
