package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f", rect.area(), rect.perimeter(), rect.diagonal());
		sc.close();

	}

}
