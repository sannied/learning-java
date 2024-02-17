package ch.hslu.informatik.prg.block08.afg01;

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
	public double getLaenge() {
		return laenge;
	}
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	@Override
	public void skaliere(double faktor) {
		setLaenge(getLaenge()*faktor);
		setHoehe(getHoehe()*faktor);
		setBreite(getBreite()*faktor);
	}
	public String toString() {
		return "Laenge: " + getLaenge() + ", Breite: " + getBreite() + ", Hoehe: " + getHoehe();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Skalierbar)) {
			return false;
		}
		
		Quader param = (Quader)obj;
		
		return this.getHoehe() == param.getHoehe() && this.getBreite() == param.getBreite();		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hoehe, breite);		
	}
	
	public int compareTo(Quader param) {
		if (this.equals(param)) {
			return 0;
		} 
		if (Double.compare(this.breite, param.breite) == 0) {
			return Double.compare(this.breite, param.breite);
		}
		return Double.compare(this.breite, param.breite);
	}
}
