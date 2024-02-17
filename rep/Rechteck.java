package ch.hslu.informatik.prg.block08.afg01.rep;

public class Rechteck extends Figur{
	private double breite;
	private double hoehe;
	
	public Rechteck(int x, int y, double breite, double hoehe) {
		super(x, y);
		this.breite = breite;
		this.hoehe = hoehe;
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
	
	public double berechneUmfang() {
		return (2*hoehe) + (2*breite);
	}
	public double berechneFlaeche() {
		return hoehe*breite;
	}
	
	public void skaliere(double faktor) {
		hoehe = hoehe*faktor;
		breite = breite*faktor;
	}
	
	@Override
	public String toString() {
		return getX() + ", " + getY() +", " + breite + ", " + hoehe;
	}
}
