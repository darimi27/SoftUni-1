package softuni.exam;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleLoops {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		BigInteger first = scan.nextBigInteger();
		BigInteger second = scan.nextBigInteger();
		BigInteger third = scan.nextBigInteger();
		int N = scan.nextInt();
		
		if (N == 1) {
			System.out.println(first);
		} else if (N == 2) {
			System.out.println(second);
		} else if (N == 3) {
			System.out.println(third);
		} else {
			BigInteger nextNum = new BigInteger("0");
			
			for (int i = 4; i <= N; i++) {
				nextNum = first.add(second);
				nextNum = nextNum.add(third);
				
				first = second;
				second = third;
				third = nextNum;
			}
			
			System.out.println(nextNum);
		}

	}

}
