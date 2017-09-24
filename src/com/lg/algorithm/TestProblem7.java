package com.lg.algorithm;

import java.util.Stack;

public class TestProblem7<T> {
	private  Stack<T> stack1=new Stack<T>();
	private  Stack<T> stack2=new Stack<T>();
	
	
	public void appendTail(T t){
		stack1.push(t);
	}
	
	public T deleteHead() throws Exception{
		
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		
		if(stack2.isEmpty()){
			throw new Exception("队列为空，不能删除");
			
		}
		return stack2.pop();
	}
	
	
	public static void main(String[] args) throws Exception
	{
	   TestProblem7<String> problem7=new TestProblem7<>();
	   
	   problem7.appendTail("1");
	   problem7.appendTail("2");
	   problem7.appendTail("3");
	   //System.out.println(problem7.deleteHead());
	   
	  System.out.println( Integer.valueOf("1")+2);
	   
	   Integer.valueOf(10);
	    Integer.parseInt("12");
	}


}
