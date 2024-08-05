package com.aurionpro.Comparator;

import java.util.Comparator;
import com.aurionpro.model.*;

public class BookComparator {
	
	public static class TitleComparator implements Comparator<Book> {
		public int compare(Book book1, Book book2) {
			return book1.getTitle().compareTo(book2.getTitle());
		}
	}

	public static class AuthorComparator implements Comparator<Book> {
		public int compare(Book book1, Book book2) {
			return book1.getAuthor().compareTo(book2.getAuthor());
		}
	}

	public static class PriceComparator implements Comparator<Book> {
		public int compare(Book book1, Book book2) {
			return (int) (book1.getPrice() - book2.getPrice());
		}
	}

	public static class PublicationYearComparator implements Comparator<Book> {
		public int compare(Book book1, Book book2) {
			return book2.getPublicationYear() - book1.getPublicationYear();
		}
	}

}
