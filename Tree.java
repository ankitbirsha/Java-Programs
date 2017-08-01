//Program for Creating tree

import java.util.Scanner;
import java.io.*;
class Node
{
	int key;
	Node left,right;

	public Node(int item)
	{
		key=item;
		left=right=null;
	}
}
class Tree
{
	Node root;
	Tree(int key)
	{
		root=new Node(key);
	}
	Tree()
	{
		root=null;
	}
	public static void main(String[] args) {
		Tree tree=new Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
	}
}