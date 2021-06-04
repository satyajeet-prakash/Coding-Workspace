package linkedList;

import java.io.*;
import java.util.*;

public class Linked_List {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static Node head;
	
	public static void InsertNode(int data) {
		Node new_node = new Node(data);
		
		if(head == null)
			head = new_node;
		else 
		{
			Node node = head;
			while(node.next != null)
				node = node.next;
			node.next = new_node;
		}
	}
	
	public static void Insert_At_Beginning(int data) {
		Node new_node = new Node(data);
		Node node = head;
		
		if(head == null)
			head = new_node;
		else
		{
			new_node.next = node;
			head = new_node;
		}
	}
	
	public static void Insert_Before_Node(int data, int node_value) {
		Node new_node = new Node(data);
		Node node = head;
		Node prev = head;
		Node next = node.next;
		
		if(head == null)
			System.out.println("Linked List is Empty.");
		else 
		{
			while(node.next!=null && node.data != node_value) {
				prev = node;
				node = next;
				next = next.next;
			}
			if(node.data == node_value) {
				new_node.next = node;
				prev.next = new_node;
			}
			else {
				System.out.println("Node with value = " + node_value + " not found.");
			}
		}
	}
	
	public static void Insert_After_Node(int data, int node_value) {
		Node new_node = new Node(data);
		Node curr = head;
		Node prev = head;
		Node next = curr.next;
		
		if(head == null)
			System.out.println("Linked List is Empty.");
		else {
			while(curr.next != null && curr.data != node_value) {
				prev = curr;
				curr = next;
				next = curr.next;
			}
			if(curr.data == node_value) {
				new_node.next = next;
				curr.next = new_node;
			}
			else
				System.out.println("Node with value = " + node_value + " not found.");
		}
		
	}
	
	public static void Insert_List(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			InsertNode(arr[i]);
		}
	}
	
	public static void Move_To_Front()
	{
		Node front = head;
		Node prev = head;
		Node curr = head;
		
		while(curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = null;
		curr.next = front;
		head = curr;
	}
	
	public static void PrintNode() {
		Node node = head;
		
		while(node != null) {
			System.out.print(node.data + " --- ");
			node = node.next;
		}
		System.out.println(" End \n");
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = {9, 9, 9, 9, 9};
		Insert_List(arr);
		PrintNode();
		
		head = Linked_List_Duplicates.Remove_Duplicates_In_Linked_List();
		PrintNode();
		
		Reverse_Linked_List.reverse_List();
		PrintNode();
		
		head = Reverse_Linked_List.reverse_In_Group(head, 4);
		PrintNode();
		
		//head.next.next.next.next.next.next = head.next.next;
		
		int starting_Node_Of_Loop = Linked_List_Loop.Starting_Node_Of_Loop();
		if(starting_Node_Of_Loop != -1) 
			System.out.println("Starting Node of Loop: " + starting_Node_Of_Loop);
		else
			System.out.println("No Loop Detected.");
		
		Move_To_Front();
		PrintNode();
		
		head = Add_Number.Add_One_Number();
		PrintNode();
	}

}
