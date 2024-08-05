package comp.Aurionpro.fileinputstreamtest;
import java.io.*;
import java.util.Scanner;

public class ShiftCharacterOfString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=sc.next();
		String s2="";
		int n =3;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch =s1.charAt(i);
			if(ch >='a' && ch<='z') {
			ch =(char)((ch - 'a' + n +26 )%26 +'a');
			s2=s2+ch;
			System.out.print(ch);
			}
			else if(ch >='A' && ch<='Z') {
				ch =(char)((ch - 'A' + n +26 )%26 +'A');
				s2=s2+ch;
				System.out.print(ch);
				}
		}
		System.out.println();
		System.out.println("Shifted String is "+s2);
		
		
	}

}
