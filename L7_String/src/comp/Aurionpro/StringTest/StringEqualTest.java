package comp.Aurionpro.StringTest;

public class StringEqualTest {

	public static void main(String[] args) {
		
		String s1="AT";
		String s2 ="AT";
		
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		
		String s5 ="B";
		System.out.println(s5.hashCode());
		s5 = s5+"M";
		System.out.println(s5.hashCode());
		
		
		String s3=new String("AT");
		String s4=new String("AT");
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3==s4);
	}
}
