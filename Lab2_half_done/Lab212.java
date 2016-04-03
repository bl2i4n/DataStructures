public class Lab212 {
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
public static void main(String[] args) {
	
		int a [] = { 2, 3, 5, 7, 11, 13, 17, 19, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 23, 29, 31, 37, 41, 43 };
		System.out.println("Smallest number is : 2"); // tried calling min method here
	}

}