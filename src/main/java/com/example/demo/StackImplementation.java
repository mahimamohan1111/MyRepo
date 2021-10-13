package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class StackImplementation {
	int[] stackArr ;
	int top; 
	int size=10;
	int min,max;

	public StackImplementation() {
		// TODO Auto-generated constructor stub
		top=-1;
		stackArr=new int[size];
	}
	void push(int element)
	{
		if(top>size-1)
		{
			System.out.println("Stack OVERFLOW");
		}
		else
		{
			if(top==0)
			{
				min=element;
				max=element;
				stackArr[++top]=element;
			}
			else {
			stackArr[++top]=element;
			if(min>element)
				min=element;
			if(max<element)
				max=element;
			}
		}
	}

	int pop()
	{
		if(top<0)

		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else	
		{
			return stackArr[top--];
		}
	}
	int getTop()
	{
		return stackArr[top];
	}

	int getMin()
	{
		return min;

	}

	int getMax()
	{
		return max;

	}
	void print()
	{
		for(int i = top;i>-1;i--)
			System.out.println(stackArr[i]);
	}

	public static void main(String args[])
	{
		StackImplementation stack= new StackImplementation();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(111);
		stack.push(5);
		stack.print();
		System.out.println("Minimum is: "+ stack.getMin());
		System.out.println("Maximum is: "+stack.getMax());

	}


}
