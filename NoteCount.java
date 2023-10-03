package com.Currency;

public class NoteCount {
	
	public void counting(int[] currency, int amount) {

	int notes[]=new int[currency.length];
	int sumOfNotes=0;
	for(int i = 0; i<currency.length; i++ ) {
		notes[i] = amount/currency[i];
		amount = amount%currency[i];
		sumOfNotes = sumOfNotes+notes[i];
		
	}
	for(int i = 0 ; i<currency.length; i++) {
		if(notes[i] != 0);

		System.out.println(currency[i] + "x" + notes[i]);
	}
	System.out.println("Total no. of notes are " + sumOfNotes);
}
	

}
