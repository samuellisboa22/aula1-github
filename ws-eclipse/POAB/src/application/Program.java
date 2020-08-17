package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangles;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangles x, y;
		x = new Triangles();
		y = new Triangles();

		System.out.println("Insira as medidas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double areaX = x.area();	
		double areaY = y.area();

		System.out.printf("A �rea do tri�ngulo X: %.4f%n", areaX);
		System.out.printf("A �rea do tri�ngulo y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A maior �rea � a do tri�ngulo X");
		} else {
			System.out.println("A maior �rea � a do tri�ngulo Y");
		}

		sc.close();
	}

}
