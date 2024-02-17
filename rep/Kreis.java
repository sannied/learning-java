package ch.hslu.informatik.prg.block08.afg01.rep;

public class Kreis extends Figur {
	private double radius;
	
	public Kreis(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double berechneUmfang() {
		return 2 * radius * Math.PI;  //Math.PI ist bereit konstante für Pi.
	}
	public double berechneFlaeche() {
		return Math.PI * radius * radius;
	}
	public void skaliere(double faktor) {
		radius = radius * faktor;
	}
	
	@Override
	public String toString() {
		return getX() + ", " + getY() +", " + radius;
	}
	
}
