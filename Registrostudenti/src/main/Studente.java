package main;

//CREO LA CLASSE STUDENTE
public class Studente {
	String nome;
	String cognome;
	int matricola;

	//CREO IL METODO STUDENTE CHE PORTA I SEGUENTI ELEMENTI IN FIRMA
	Studente(int matricola, String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
}
