import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static BigInteger slove(int n) {
		BigInteger res = new BigInteger("2");
		BigInteger tmp = new BigInteger("3");
		res = res.pow(n);
		res = res.multiply(tmp);
		res = res.subtract(BigInteger.ONE);
		
		return res;
		
		
	}
	public static void main(String[] args) {
		long t;
		Scanner scn = new Scanner(System.in);
		t = scn.nextLong();
		while(t > 0) {
			t--;
			int n;
			n = scn.nextInt();
			if(n == 1) {
				System.out.println(1);
				continue;
			}
			
			System.out.println(slove(n-2));
		}
	}

}
