package com.test;

public class StringManipulation {
	public static void main(String[] args){
		String str="java learning centre";
		String str1="StringManipulation";
		String str3="JAVA LEARNING CENTRE";
		System.out.println("Using intern method()\t"+str.intern());
		System.out.println("Using Length()\t"+str.length());
		System.out.println("isEmpty Method"+str.isEmpty());
		String str2=str.concat("JLC");
		System.out.println("After Concatenation"+str2);
		String LowerCase=str2.toLowerCase();
		System.out.println("Using LowerCase"+LowerCase);
		String UpperCase=str2.toUpperCase();
		System.out.println("Using UpperCase"+UpperCase);
		String trim=str2.trim();
		System.out.println("Using trim"+trim);
		System.out.println("Using toString()"+str2.toString());
		System.out.println("Using charAt()"+str.charAt(2));
		char[] ch=str.toCharArray();
		System.out.println("USing toCharArray()");
		for(char x:ch)
			System.out.println(x);
		byte[] by=str.getBytes();
		System.out.println("Using getBytes() Method");
		for(byte b:by)
			System.out.println(b);
		System.out.println("Using equalsIgnoreCase()"+str.equalsIgnoreCase(str3));
		StringBuffer str4=new StringBuffer("java learning centre");
		System.out.println("using contentEquals(StringBuffer)"+str.contentEquals(str4));
		System.out.println("Using Starts With()"+str.startsWith("ja"));
		System.out.println("Using endsWith() Method"+str.endsWith("re"));
		System.out.println("Using indexOf char Method"+str.indexOf("v"));

		}
}
