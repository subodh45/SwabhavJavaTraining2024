package com.aurionpro.test;

import com.aurionpro.Comparator.BookComparator;
import com.aurionpro.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {
	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();

		books.add(new Book("A Tale of Two Cities", "Charles Dickens", 500, 1859));
		books.add(new Book("The Little prince", "Antoine Exupery", 800, 1943));
		books.add(new Book("Harry potter", "J.K.Rowling", 1000, 1939));
		books.add(new Book("And then There were none", "Agatha christie", 300, 1939));
		books.add(new Book("The Hobbit", "J.R.R.Tolkien", 1000, 1943));
		books.add(new Book("Black Beauty", "Anna Sewell", 500, 1877));
		books.add(new Book("The Running grave", "J.K.Rowling", 1200, 2022));
		books.add(new Book("Career of Evil", "J.K.Rowling", 1200, 2016));
		books.add(new Book("Revolution 2020", "Chetan Bhagat", 500, 2011));
		books.add(new Book("Two States", "Chetan Bhagat", 800, 2012));

		System.out.println("Sorting based on Title");
		Collections.sort(books, new BookComparator.TitleComparator());
		printBook(books);
		System.out.println();

		System.out.println("Sorting based on Author ");
		Collections.sort(books, new BookComparator.AuthorComparator());
		printBook(books);

		System.out.println();
		System.out.println("Sorting based on price");
		Collections.sort(books, new BookComparator.PriceComparator());
		printBook(books);

		System.out.println();
		System.out.println("sorting based on Year ");
		Collections.sort(books, new BookComparator.PublicationYearComparator());
		printBook(books);

		System.out.println();
		System.out.println("sorting first by author then by title and finally by price ");
		Collections.sort(books,
				new BookComparator.AuthorComparator().thenComparing(new BookComparator.TitleComparator())
						.thenComparing(new BookComparator.PriceComparator()));
		printBook(books);

		System.out.println();
		System.out.println("Sorting first by Publication year ,then by price and finally by author.");
		Collections.sort(books, new BookComparator.PublicationYearComparator().thenComparing(
				new BookComparator.PriceComparator().thenComparing(new BookComparator.AuthorComparator())));
		printBook(books);
	}

	private static void printBook(List<Book> books) {
		// TODO Auto-generated method stub
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
