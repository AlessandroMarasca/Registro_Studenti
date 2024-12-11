package main;
import java.util.ArrayList;
public class Registro {
	//CREO IL CONTENITORE ARRAYLIST PER GLI STUDENTI
	ArrayList <Studente> stu = new ArrayList <Studente>();
	
	
	//CREO IL METODO PER AGGIUNGERE STUDENTI AL REGISTRO
	public void agg(Studente aggiunto) {
		boolean add = false;
		for(int h = 0; h<stu.size(); h++) {
			if(aggiunto.matricola == stu.get(h).matricola) {
				add = true;
				break;
			}
		}
		if (add == false) {
			stu.add(aggiunto);
		} else {
			System.out.println("Questa matricola è già presente nel registro");
		}
	}
	
	//STAMPO L'ELENCO DEGLI STUDENTI INCLUDENDONE I DATI.
	public void elenco() {
		for(int i=0; i<stu.size(); i++) {
			System.out.println(stu.get(i).matricola + " " + stu.get(i).cognome + " " + stu.get(i).nome);
		
		}
	}
	//CREO IL METODO CERCAMAT PER CERCARE LA MATRICOLA DELLO STUDENTE
	public void cercamat () {
		for(int j = 0; j<stu.size(); j++) {
			System.out.println("La matricola " + stu.get(j).matricola + " è presente nell'elenco.");
		}
	}
}
