package comp.Aurionpro.fileinputstreamtest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro\\L6_Homework\\src\\comp\\Aurionpro\\fileinputstreamtest\\Myfile1");
		
		int ch ;
		
		int word=0;
		int letter=0;
		int line=1;
		int word2=0;
		boolean isword=false;
		
		
		while((ch =fileInputStream.read())!= -1) {
			  
			  char currentch =(char)ch;
			  
			  if(Character.isLetter(currentch))
			  {
				  letter++;
			  }
			  
			  if(Character.isWhitespace(currentch) || currentch == '\n')
			  {
				  word++;
			  }
			  
			  if(Character.isWhitespace(currentch) || currentch == '\n')
			  {
				  if(isword)
				  {
					  word2++;
					  isword =false;
				  }  
			  }else
			  {
				  isword=true;
			  }
			  
			  
			  if(currentch == '\n')
			  {
				  line++;
			  }
			  			
		}
		
		 if(isword)
		  {
			  word2++;
		  }

		System.out.println();
		System.out.println("no of word :"+ word);
		System.out.println("no of word :"+ word2);
		System.out.println("no of letter :"+ letter);
		System.out.println("Line: "+ line);
		
		fileInputStream.close();
	}
}
