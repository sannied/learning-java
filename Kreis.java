package ch.hslu.informatik.prg.block08.afg01;

public class Kreis extends Figur{
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
		return 2 * radius * Math.PI;
	}
	public double berechneFlaeche() {
		return Math.PI * radius * radius;
	}
	@Override
	public void skaliere(double faktor) {
		setRadius(getRadius()*faktor);
	}
	@Override
	public String toString() {
		return "Radius: " + getRadius();
	}
}
