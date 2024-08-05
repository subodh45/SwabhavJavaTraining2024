package com.Aurionpro.Test;
import com.Aurionpro.Model.*;
import java.util.*;

public class BookTest {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter number of books ");
	  int size =sc.nextInt();
	  
	  Book books[] =new Book[size];
	  
	  for(int n =0;n<size;n++)
	  {
		  System.out.println("ENter BookId");
		  int bookId = sc.nextInt();
		  
		  System.out.println("Enter Book name ");
		  String name =sc.next();
		  
		  
		  System.out.println("Enter Book author name ");
		  String author =sc.next();
		 
		  
		  System.out.println("enter price ");
		  double price =sc.nextDouble();
		  
		  System.out.println("Enter Book publication name ");
		  String publication =sc.next();
		  
		  books[n]=new Book(bookId,name,author,price,publication);
		  
	  }
	  
	  for(Book d : books)
	  {
		 
		 System.out.println(" Name : " + d.getname() );
		 System.out.println(" Book id "+ d.getBookId());
		 System.out.println(" Book Author "+d.getAuthor());
		 System.out.println(" Price "+d.getPrice());
		 System.out.println(" Publication "+ d.getPublication());
		 System.out.println();
	  }
	
	  
}
}
