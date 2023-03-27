package Biblioteca;

import java.util.Scanner;

public class Catalogo {

	static Scanner scanner = new Scanner (System.in);
			
			protected int isbn;
			protected String titolo;
			protected int year;
			private int numberOfPage;
			
			private Catalogo () {};
			
			public Catalogo (int isbn, String titolo, int year, int pages) {
				this.isbn = isbn;
				this.titolo = titolo;
				this.year = year;
				this.numberOfPage = pages;
			}

			public int getISBN() {
				return isbn;
			}

			public void setISBN(int isbn) {
				this.isbn = isbn;
			}

			public String getTitolo() {
				return titolo;
			}

			public void setTitolo(String titolo) {
				this.titolo = titolo;
			}

			public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}

			public int getNumberOfPage() {
				return numberOfPage;
			}

			public void setNumberOfPage(int numberOfPage) {
				this.numberOfPage = numberOfPage;
			}

	}

