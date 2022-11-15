package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Inserisci il numero di km da percorrere: ");
		int kmToDo = sc.nextInt();
		
		System.out.print("Inserisci la tua eta: ");
		int userAge = sc.nextInt();
		
		sc.close();
		
		float finalPrice = kmToDo * .21f;
		
		if (userAge >= 65) {
			
			finalPrice -= finalPrice / 100 * 40;
			
		} else if (userAge < 12) {
			
			finalPrice = 0;
			
		} else if (userAge < 18) {
			
			finalPrice -= finalPrice / 100 * 20;
		}
		
		System.out.println("KM " + kmToDo);
		System.out.println("Age " + userAge);
		System.out.println("Price " + finalPrice);
		
		
	}
}


//Ciao!
//Esercitazione di oggi: Biglietto del treno
//Nome repo: java-biglietto-treno
//Il programma dovrà chiedere all'utente il numero di chilometri che vuole percorrere e l'età del passeggero. Sulla base di queste informazioni dovrà calcolare
//il prezzo totale del viaggio, secondo queste regole:
//il prezzo del biglietto è definito in base ai km (0.21 € al km)
//va applicato uno sconto del 20% per i minorenni
//va applicato uno sconto del 40% per gli over 65
//Come sempre create un progetto java con lo stesso nome del repo (java-biglietto-treno), aggiungete un package org.generation.italy e una classe CalcolaBiglietto.
//Il programma va implementato nel metodo main della classe CalcolaBiglietto.
//Per acquisire l'input dell'utente usate la classe Scanner, come visto stamattina a lezione.
//Buon lavoro!
//
//-------------------------------------
//
//BONUS1: i minori di 12 anni viaggiano gratis
//BONUS2: ogni km costa 1 centesimo piu' del precedente (es: 1km = 0.21E, 2km = 0.43, 3km = 0.66E, ecc)