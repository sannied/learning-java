package ch.hslu.informatik.prg.block08.afg01;

public class Rechteck extends Figur {
	private double breite;
	private double hoehe;
	
	public Rechteck(int x, int y, double breite, double hoehe) {
		super(x,y);
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
	
	public double berechneUmfang() {
		return (2*hoehe) + (2*breite);
	}
	public double berechneFlaeche() {
		return hoehe*breite;
	}
	
	public void skaliere(double faktor) {
		setBreite(getBreite()*faktor);
		setHoehe(getHoehe()*faktor);
	}
	public String toString() {
		return "Breite: " + getBreite() + " , Hoehe: " + getHoehe();
	}
}
