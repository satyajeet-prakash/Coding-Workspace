package Matrix;

import java.io.*;
import java.util.*;

public class Common_Element extends matrix 
{
	public static void commonElement(int[][] mat)
	{
		int R = mat.length, C = mat[0].length;
		
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(int i = 0; i < C; i++)
			mp.put(mat[0][i], 1);
		
		System.out.print("\n\nCommon Element in all rows of matrix: ");
		for(int i = 1; i < R; i++)
		{
			for(int j = 0; j < C; j++)
			{
				if(mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i)
				{
					mp.put(mat[i][j], i+1);
					
					if(i == R-1)
						System.out.print(mat[i][j] + " ");
				}
			}
		}
	}
	
}
