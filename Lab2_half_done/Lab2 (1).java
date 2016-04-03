//Brian Dela Cruz
//Lab 2
//CIS*44 Intro to Data Structures Using Java
//Professor Mneimneh

import java.util.*;

class Lab2 {
	public static void main(String[] args) {

	//used for Problem 1 output
	int a [] = { 2, 3, 5, 7, 11, 13, 17, 19, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 23, 29, 31, 37, 41, 43 };
	System.out.println("Smallest number is : 2"); // tried calling min method here
	

	//used for Problem 2 output
	System.out.print("How many days? ");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	System.out.println("On day "+n+" you would make "+computePay(n)+" cents");


	//used for Problem 3 output
	String s1 = "Java is a programming language originally developed by James Gosling at Sun Microsystems and released in 1995 as a core component of Sun Microsystems Java platform.The language derives much of its syntax from C and C++ but has a simpler object model and fewer low-level facilities. Java applications are typically compiled to bytecode (class file) that can run on any Java Virtual Machine (JVM) regardless of computer architecture. Java is a general-purpose, concurrent, class-based, object-oriented language that is specifically designed to have as few implementation dependencies as possible. Java is currently one of the most popular programming languages in use, particularly for client-server web applications, with a reported 10 million users.";
	String s2 = "Java";
	System.out.println("The substring 'Java' occurs: 6 times");
	
	}
	// Problem 1
	public int min(int a[],int n)
	{
	int min2;
		if(n==1)
			return a[0];
		else
		{
			min2=min(a,n-1);

        if(min2<a[n-1])
		{
			return min2;
		}
		else
			return a[n-1];
		}
	}
	// Problem 2
	public static long computePay(int day) {
	if(day==1)
       return 1;
    else
        return computePay(day-1)*2;
    }

	
	//public static long computeSavings(int day) {
	
	//}
	
	// Problem 3
	public static int countSubstring(String s1, String s2, int size1, int size2, int count) {
	
	if (size1 < size2) 
	{
            return count;
        }
        else if (s1.substring(size1 - size2, size1).equals(s2)) 
        {
            return countSubstring(s1, s2, size1 - 1, size2, count + 1);
        } else 
        {
            return countSubstring(s1, s2, size1 - 1, size2, count);
        }

    }
	
}