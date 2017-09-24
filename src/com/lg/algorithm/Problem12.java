package com.lg.algorithm;


public class Problem12 {
  public static void main(String[] args){
	  StringBuffer sb=new StringBuffer(10);
	  for(int i=0;i<10;i++){
		  sb.append('0');
	  }
	  sb.setCharAt(0,(char)(20+'0'));
	  System.out.println(sb.toString().charAt(0));
	  
	}
  
}
