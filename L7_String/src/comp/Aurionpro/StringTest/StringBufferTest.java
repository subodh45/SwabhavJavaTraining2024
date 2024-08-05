package comp.Aurionpro.StringTest;

public class StringBufferTest {
  public static void main(String[] args) {
	
	  StringBuffer sb1 = new StringBuffer("Subodh ");
	  System.out.println(sb1.hashCode());
	  sb1= sb1.append(" magar");
	  System.out.println(sb1.hashCode());
}
}
