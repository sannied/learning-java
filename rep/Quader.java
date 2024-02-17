package ch.hslu.informatik.prg.block08.afg01.rep;

import java.util.Objects;

public class Quader implements Skalierbar, Comparable<Quader>{
	private double laenge;
	private double breite;
	private double hoehe;
	
	public Quader(double laenge, double breite, double hoehe) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public void skaliere(double faktor) {
		laenge = laenge*faktor;
		breite = breite*faktor;
		hoehe = hoehe*faktor;
	}
	
	@Override
	public String toString() {
		return laenge + ", " + breite + ", " + hoehe;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Quader)) {
			return false;
		}
		Quader param = (Quader)obj;
		
		return this.laenge == param.laenge;
	}
	@Override
	public int hashCode() {
		return Objects.hash(laenge);
	}
	
	@Override
	public int compareTo(Quader param) {
		int vergleichLaenge = Double.compare(this.laenge, param.laenge);
		return vergleichLaenge;
	}
	
}
