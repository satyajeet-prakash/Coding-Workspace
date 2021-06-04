package Matrix;

import java.io.*;
import java.util.*;

public class matrix {

	public static void Print_Matrix(int[][] matrix, int id)
	{
		System.out.println("\nResultant Matrix " + id + " :--");
		for(int i = 0 ; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br .readLine());
		int c = Integer.parseInt(br.readLine());
		
		int[][] matrix1 = new int[r][c];
		
		for(int i = 0; i < r; i++)
			for(int j = 0; j < c; j++)
				matrix1[i][j] = Integer.parseInt(br.readLine());
		
		Print_Matrix(matrix1, 01);
		
//		Rotate_Matrix.rotate_clockwise(matrix1, 2);
//		Rotate_Matrix.Rotate_Matrix_Full_Clockwise(matrix1);
//		System.out.println("\nMatrix Spiral Traversal: " + Traversal.spiral_traversal(matrix1));
//		basic.search_Element(matrix1, 21);
//		System.out.println("\nMedian in Sorted Matrix(odd matrix): " + basic.median_In_Sorted_Matrix(matrix1));
//		basic.sort_matrix(matrix1);Print_Matrix(matrix1, 04);
//		System.out.println("\nMaximum Difference: " + Traversal.Maximum_difference(matrix1));
//		Common_Element.commonElement(matrix1);
		System.out.println("\n\nKth Smallest Element in Matrix: " + basic.kth_smallest(matrix1, 3));
		
	}

}
