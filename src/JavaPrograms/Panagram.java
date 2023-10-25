package JavaPrograms;

import java.util.Scanner;

public class Panagram {

	public static boolean IsPanagram(String s)
	{
		if(s.length()<26)
			return false;
		int[] a=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			a[ch-65]++;
			else if(ch>='a'&&ch<='z')
				a[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(a[i]==0)
				return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an sentance");
		String s=sc.nextLine();
		boolean res=IsPanagram(s);
		if(res)
			System.out.println(res+"===>"+"is panagram");
		else
			System.out.println(res+"===>"+"is not a panagram");
	}

}
