package ch.hslu.informatik.prg.block08.afg01;

public abstract class Figur implements Skalierbar {
	protected int x;
	protected int y;
	
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
	
	// in der UML-Notation kursiv geschrieben, daher abstrakt. Dadurch muss auch
	// Klasse absrakt sein. 
	public abstract double berechneUmfang();
	public abstract double berechneFlaeche();
	
	public abstract void skaliere(double faktor);
	
}
	
	
	
