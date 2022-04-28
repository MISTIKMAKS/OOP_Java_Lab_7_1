package Lab7_1;

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		System.out.println("-------------------------");
		Matrix a = Matrix.Create();
		a.Fill();
		System.out.println("");
		a.Display();
		System.out.println("");
		System.out.println("-------------------------");
		Matrix b = Matrix.Create();
		b.Fill();
		System.out.println("");
		b.Display();
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("a - b: ");
		Matrix c = Matrix.Plus(a, b);
		System.out.println("");
		c.Display();
		System.out.println("");
		System.out.println("\na == b: " + (a.equals(b)) + "\n");
		System.out.println("-------------------------");
		System.out.println("Matrix norm from matrix a: " + a.Norm());
	}

}
