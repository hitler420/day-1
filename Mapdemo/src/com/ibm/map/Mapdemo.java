package com.ibm.map;
import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
public static void main(String[] args) {
	createMapofBooks();
}

private static void createMapofBooks() {
	// TODO Auto-generated method stub
	Map<String,Book> books=new HashMap<String,Book>();
	System.out.println(books.size());
	Book book1=new Book("java");
	books.put("book1",book1);
	System.out.println(books.size());
	for(int i=0;i<10;i++) {
		Book book1=new Book("java"+1);
		books.put("book"+i,book1);
	}
	System.out.println(book.size());
}
}
