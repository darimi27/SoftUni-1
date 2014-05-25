package softuni.exam;

import java.util.Scanner;

public class DrawFigure {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		// from top to middle
		int dotsCount = 0;
		int asteriskCount = size;
		for (int i = 0; i < size / 2; i++) {
			
			System.out.print(new String(new char[dotsCount]).replace('\0', '.'));
			
			System.out.print(new String(new char[asteriskCount]).replace('\0', '*'));
			
			System.out.println(new String(new char[dotsCount]).replace('\0', '.'));
			
			dotsCount++;
			asteriskCount-=2;
			
		}
		
		// middle
		System.out.print(new String(new char[dotsCount]).replace('\0', '.'));		
		System.out.print('*');		
		System.out.println(new String(new char[dotsCount]).replace('\0', '.'));
		
		// from middle to bottom
		for (int i = 0; i < size / 2; i++) {
			
			dotsCount--;
			asteriskCount+=2;
			
			System.out.print(new String(new char[dotsCount]).replace('\0', '.'));
			
			System.out.print(new String(new char[asteriskCount]).replace('\0', '*'));
			
			System.out.println(new String(new char[dotsCount]).replace('\0', '.'));
		}
		
	}

}
