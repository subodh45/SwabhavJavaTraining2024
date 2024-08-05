package comp.Aurionpro.fileinputstreamtest;
import java.io.*;
import java.util.Scanner;

public class FileLengthTest{
	public static void main(String args[]) throws IOException
	{

		// create file specify path for creation of file at specify location
		File f = new File("D:\\Aurionpro\\L6_Homework\\src\\comp\\Aurionpro\\fileinputstreamtest\\MyTestFile2");
		
		if(f.exists())
		{System.out.println("File already Exits.");}
		else{
			f.createNewFile();
	     System.out.println("file created Successfully.");		
	}

		//get path of file
		System.out.println("Path ="+f.getAbsolutePath() );
		
		//get name of file
		System.out.println(f.getName());
		
		//delete file
		//f.delete();
		//System.out.println( "file Deleted .");
		
		// Get the length of the file
		System.out.println("length: " + f.length() +" free space "+ f.getFreeSpace());
		
		//Write into File
		 FileWriter myWriter = new FileWriter("D:\\\\Aurionpro\\\\L6_Homework\\\\src\\\\comp\\\\Aurionpro\\\\fileinputstreamtest\\\\MyTestFile2");
	     myWriter.write("We can write into file using FileWriter. "+"\n"+ "We can read The file data using scanner.");
	     myWriter.write("Updated line .");
	     myWriter.close();
	     System.out.println("Successfully wrote to the file.");
	     
	     //read Line
	     
	     Scanner myReader = new Scanner(f);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	}
}
