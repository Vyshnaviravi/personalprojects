package Numbers;
import java.util.Random;
public class random_numbersgenerate {
static void otp() {
	Random r=new Random();
	int x=1000+r.nextInt(8999);
	int y=1000+r.nextInt(899);
	int z=1000+r.nextInt(89);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	}
   public static void main(String[] args) {
	otp();
}
}
