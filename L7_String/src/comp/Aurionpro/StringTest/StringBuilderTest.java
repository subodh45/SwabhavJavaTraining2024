package comp.Aurionpro.StringTest;

public class StringBuilderTest {
 public static void main(String[] args) {
	
	 StringBuilder sb1 =new StringBuilder("Subodh ");
	 System.out.println(sb1.hashCode());
	 sb1 =  sb1.append(" magar");
	 System.out.println(sb1.hashCode());
}
}
