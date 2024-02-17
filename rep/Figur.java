package ch.hslu.informatik.prg.block08.afg01.rep;

public abstract class Figur implements Skalierbar{
	private int x;
	private int y;
	
	public Figur(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public abstract double berechneUmfang();
	
	public abstract double berechneFlaeche();
	

	public void skaliere(double faktor) {
		
	}
}
