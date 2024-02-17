package ch.hslu.informatik.prg.block08.afg01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		
		Skalierbar figur1 = new Rechteck(1, 1, 44.4, 55.5);
		Skalierbar figur2 = new Kreis(1, 1, 4);
		Skalierbar figur3 = new Quader(20, 30, 40);

		Skalierbar[] arrSka = new Skalierbar[3];
		arrSka[0] = figur1;
		arrSka[1] = figur2;
		arrSka[2] = figur3;
		
		System.out.println("Groesse vor der Skalierung: ");

		for (Skalierbar element : arrSka) {
			System.out.println(element);
		}
		
		//Skalierung
		for (Skalierbar element : arrSka) {
			element.skaliere(10);
		}
		
		System.out.println("\nGroesse nach der Skalierung: ");
		
		for (Skalierbar element : arrSka) {
			System.out.println(element);
		}	
		
		//Teilaufgabe 4: 
		Quader q1 = new Quader(10, 20, 30);
		Quader q2 = new Quader(13, 55, 60);
		Quader q3 = new Quader(44, 5, 10);
		
		Quader[] arrQua= new Quader[3];
		arrQua[0] = q1;
		arrQua[1] = q2;
		arrQua[2] = q3;
		
		Arrays.sort(arrQua);

        // Display the sorted array
        System.out.println("\nQuader sortiert nach Grösse: ");
        for (Quader element : arrQua) {
            System.out.println(element);
        }
	}
}
