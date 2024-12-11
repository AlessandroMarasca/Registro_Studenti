package main;
import java.util.Scanner;
/*
 * Gestione di un Registro di Studenti
Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:

Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma


 */
public class Main {

	public static void main(String[] args) {
		
		//DO UNA VARIABILE MENù PER IL CICLO DI SCELTA
		int menu = 0;
		Scanner dato = new Scanner(System.in);
		
		//ISTANZIO L'OGGETTO REG DALLA CLASSE REGISTRO PER RICHIAMARLO NEL MAIN E RIUTILIZZARE IL CODICE NELLA CLASSE REGISTRO
		Registro reg = new Registro();
		
		//ESEGUO UN CICLO DO WHILE PER RIPETERE POSSIBILI SCELTE NEL MENU' FINO A CHE LA CONDIZIONE MENU != 4 SARA' VERA.
		do {
			System.out.println("Benvenuto nel registro elettronico. Cosa desideri fare? \n1)Registra nuovo studente/ssa \n2) Visualizza l'elenco di tutti gli studenti \n3)Cerca studente per matricola \n4) Uscire dal programma");
			menu = dato.nextInt();
		
			//ESEGUO UNO SWITCH RICHIAMANDO AD OGNI CASO LA CLASSE REG E IL METODO APPROPRIATO (ogni metodo è associato ad una scelta per l'utente nel print a riga 38)
			switch(menu) {
			
			//METODO AGG
			case 1:
				System.out.println("Bene, inserire la matricola: ");
				int matricola = dato.nextInt();
				dato.nextLine();
				System.out.println("Ora il nome: ");
				String cognome = dato.nextLine();
				System.out.println("Infine aggiungi il cognome dello studente: ");
				String nome = dato.nextLine();
				Studente stud1 = new Studente(matricola, nome, cognome);
				reg.agg(stud1);
				break;
			
				//METODO ELENCO
			case 2:
				System.out.println("Ecco l'elenco completo degli studenti: ");
				reg.elenco();
				break;
		
				//METODO CERCAMAT
			case 3:
				System.out.println("Inserire la matricola dello studente da ricercare: ");
				int matri = dato.nextInt();
				reg.cercamat();
			}
		
			//CONDIZIONE D'INGRESSO NEL METODO E FINE DEL CICLO INDEFINITO DO WHILE	
		}while(menu != 4);
		
		//USCITA DAL PROGRAMMA
		System.out.println("Grazie e arrivederci.");
		
		
	}

}