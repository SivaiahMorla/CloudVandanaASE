package JavaPrograms;

import java.util.Scanner;

public class RomanNUmber {
	public static int Value(char c)
	{
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		if(c=='X')
			return 10;
		if (c == 'L')   
		    return 50;   
		 if (c == 'C')   
		     return 100;   
		 if (c == 'D')   
		     return 500;   
		 if (c == 'M')   
		      return 1000;   
		    return -1;   
		
	}
	public static int Convert(String s)//IX
	{
		int total=0;
		for(int i=0;i<s.length();i++)
		{
			int j=i+1;
			int a=Value(s.charAt(i));
			if(j<s.length())
			{
			int b=Value(s.charAt(j));
			if(a>=b)
				total=total+a;
			else
				total=total-a;
			}
			else
			{
				total=total+a;
			}
		}
		return total;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a roman number");
		String s=sc.next();
		int res=Convert(s);
     System.out.println(s+" "+"value is"+"===>"+res);
	}

}
