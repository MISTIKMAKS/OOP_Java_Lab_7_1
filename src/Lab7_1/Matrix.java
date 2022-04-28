package Lab7_1;

import java.util.Scanner;
import java.lang.Math;

public class Matrix {
	private int N;
	private int[][] matrix;

	private static Scanner scan = new Scanner(System.in);

	public Matrix()
	{
		this.N = 0;
		this.matrix = new int[N][N];
	}
	public Matrix(int n)
	{
		if (n > 0)
		{
			this.N = n;
			this.matrix = new int[N][N];

			for (int i = 0; i < N; i++)
			{
				for (int j = 0; j < N; j++)
				{
					matrix[i][j] = 0;
					}
				}
			}
		}
	public void setMat(int[][] mat)
	{
		this.matrix = mat;
	}
	public void setN(int n)
	{
		N = n;
	}
	public int[][] getMat()
	{
		return matrix;
	}
	public int getN()
	{
		return N;
	}
	public static Matrix Create() {
		int n = 0;
		do
		{
			System.out.println("Please, input number of lines|rows:");
			String st = scan.nextLine();
			n = Integer.parseInt(st);
		} while (!(n > 0));
		return new Matrix(n);
	}
	public void Fill()
	{
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				System.out.println("Input number in line " + (i + 1) + " in row " + (j + 1));
				String str = scan.nextLine();
				this.matrix[i][j] = Integer.parseInt(str);
			}
		}
	}
	public void Display()
	{
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static Matrix Plus(Matrix a, Matrix b)
	{
		if (a.N == b.N && a.N == b.N)
		{
			Matrix matrix = new Matrix(a.N);
			for (int i = 0; i < a.N; i++)
			{
				for (int j = 0; j < a.N; j++)
				{
					matrix.matrix[i][j] = a.matrix[i][j] - b.matrix[i][j];
				}
			}
			return matrix;
		}
		else
		{
			System.out.println(("Matrix must have same size! Returning zero matrix..."));
			return new Matrix();
		}
	}
	@Override
	public boolean equals(Object matrix) {
		Matrix b = (Matrix)matrix;
		if (this.N == b.getN())
		{
			for (int i = 0; i < this.N; i++)
			{
				for (int j = 0; j < this.N; j++)
				{
					if (this.matrix[i][j] != b.matrix[i][j])
					{
						return false;
						}
					}
				}
			return true;
			}
		else
		{
			return false;
		}
	}
	public double Norm()
	{
		double min = matrix[0][0];
        double max = matrix[0][0];
        double result = 0;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (matrix[i][j] > max)
                {
                    max = matrix[i][j];
                }

                if (matrix[i][j] < min)
                {
                    min = matrix[i][j];
                }
            }
        }
        result = Math.abs(max - min);
        return result;

	}
}
