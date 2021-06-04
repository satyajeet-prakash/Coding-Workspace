package Stack;

import java.util.*;

public class Concept_1_Nearest_Element {
	
	public static int[] Nearest_Smallest_Left(int[] arr, int n)
	{
		int[] out = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		if(n == 0 || n == 1) {
			out[0] = -1;
			return out;
		}
		for(int i = 0; i < n; i++) 
		{
			while(!stack.isEmpty() && stack.peek() >= arr[i])
				stack.pop();
			
			if(stack.isEmpty())
				out[i] = -1;
			else
				out[i] = stack.peek();
			
			stack.push(arr[i]);
		}
		return out;
	}
	
	public static int[] Nearest_Smallest_Right(int[] arr, int n)
	{
		int[] out = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		if(n == 0 || n == 1) {
			out[0] = -1;
			return out;
		}
		for(int i = n-1; i >= 0; i--)
		{
			while(!stack.isEmpty() && stack.peek() >= arr[i])
				stack.pop();
			
			if(stack.isEmpty())
				out[i] = -1;
			else
				out[i] = stack.peek();
			
			stack.push(arr[i]);
		}
		return out;
	}
	
	public static int[] Nearest_Greatest_Left(int[] arr, int n)
	{
		int[] out = new int[n];
		Stack<Integer>  stack = new Stack<>();
		
		if(n == 0 || n == 1) {
			out[0] = -1;
			return out;
		}
		for(int i = 0; i < n; i++)
		{	
			while(!stack.isEmpty() && stack.peek() <= arr[i])
				stack.pop();
			
			if(stack.isEmpty())
				out[i] = -1;
			else
				out[i] = stack.peek();
			
			stack.push(arr[i]);
		}
		return out;
	}
	
	public static int[] Nearest_Greatest_Right(int[] arr, int n)
	{
		int[] out = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		if(n == 0 || n == 1) {
			out[0] = -1;
			return out;
		}
		for(int i = n-1; i >= 0; i--)
		{
			while(!stack.isEmpty() && stack.peek() <= arr[i])
					stack.pop();
			
			if(stack.isEmpty()) 
				out[i] = -1;
			else 
				out[i] = stack.peek();
			
			stack.push(arr[i]);
		}
		return out;
	}
	
	public static void Print(int[] arr)
	{
		System.out.print("\n\nArray: ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");
	}

	public static void main(String[] args) 
	{
		
		int[] arr = {3, 4, 2, 5};
		
		Print(arr);
		int [] output1 = Nearest_Smallest_Left(arr, arr.length);
		Print(output1);
	}

}
