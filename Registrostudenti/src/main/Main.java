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
		do {
			System.out.println("Benvenuto nel registro elettronico. Cosa desideri fare? \n1)Registra nuovo studente/ssa \n2) Visualizza l'elenco di tutti gli studenti \n3)Cerca studente per matricola \n4) Uscire dal programma");
			menu = dato.nextInt();
			switch(menu) {
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
			case 2:
				System.out.println("Ecco l'elenco completo degli studenti: ");
				reg.elenco();
				break;
			case 3:
				System.out.println("Inserire la matricola dello studente da ricercare: ");
				int matri = dato.nextInt();
				reg.cercamat();
			}
			
		}while(menu != 4);
		System.out.println("Grazie e arrivederci.");
		
		
	}

}