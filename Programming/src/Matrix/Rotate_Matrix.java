package Matrix;

import java.io.*;
import java.util.*;

public class Rotate_Matrix extends matrix
{
	public static void rotate_clockwise(int[][] mat, int no_of_times)
	{ 
		
		while(no_of_times > 0)
		{

			int row = 0, col = 0;
			int R = mat.length, C = mat[0].length;
			int m = R, n = C;
			int prev, curr;
			
			while(row < m && col < n)
			{
				if(row+1 == m || col+1 == n)
					break;
				
				prev = mat[row+1][col];
				
				for(int i = col; i < n; i++)
				{
					curr = mat[row][i];
					mat[row][i] = prev;
					prev = curr;
				}
				row++;
				
				for(int i = row; i < m; i++)
				{
					curr = mat[i][n-1];
					mat[i][n-1] = prev;
					prev = curr;
				}
				n--;
				
				if(row < m)
				{
					for(int i = n-1; i >= col; i--)
					{
						curr = mat[m-1][i];
						mat[m-1][i] = prev;
						prev = curr;
					}
				}
				m--;
				
				if(col < n)
				{
					for(int i = m-1; i >= row; i--)
					{
						curr = mat[i][col];
						mat[i][col] = prev;
						prev = curr;
					}
				}
				col++;
			}
			no_of_times--;
		}
		
		matrix.Print_Matrix(mat, 02);
	}
	
	public static void Rotate_Matrix_Full_Clockwise(int [][]mat)
	{
		int row = mat.length, col = mat[0].length;
		
		//First Transpose the matrix given
		basic.transpose(mat);
		
		//And then reverse the transpose matrix
		basic.reverse_row_wise(mat);
		
		matrix.Print_Matrix(mat, 03);
	}
}
