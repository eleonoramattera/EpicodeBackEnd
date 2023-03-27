package Articolo;

import java.time.LocalDate;

public class Cliente {

private String codice;
private String nome;
private String cognome;
private String email;
private LocalDate dataIscrizione;

//COSTRUTTORI
private Cliente () {
	System.out.println("Cliente nuovo :");
}
public Cliente (String nome, String cognome, String email) {
	this();
	this.nome= nome;
	this.cognome= cognome;
	this.email= email;
	this.dataIscrizione = LocalDate.now();
	this.codice = generateCodice();
}

private String generateCodice () {
	return this.nome + this.cognome + this.email;
}

public String getNome () {
	return this.nome;
}
public void setNome (String n) {
	this.nome = n.toUpperCase();
}

public String getCodice () {
	return this.codice;
		}
}
