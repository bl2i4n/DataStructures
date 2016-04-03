

import java.util.*;

public class recursiveAdd
{
public static void main(String[] args)

{ 
	System.out.print("How many days? ");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	System.out.println("On day "+n+" you would make "+sum(n)+" cents");
}

public static int sum(int day)
{	if(day==1)
       return 1;
    else
        return sum(day-1)*2;
    }
}

