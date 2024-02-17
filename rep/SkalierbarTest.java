package ch.hslu.informatik.prg.block08.afg01.rep;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SkalierbarTest {
	public static void main(String[] args) {
		
		Skalierbar s1 = new Rechteck(2, 2, 65, 23.90);
		Skalierbar s2 = new Kreis(5, 3, 45.50);
		
		Quader s3 = new Quader(54.50, 78.50, 65);
		Quader s4 = new Quader(60.5, 45.5, 80);
		Quader s5 = new Quader(30.5, 10.5, 10);

		Quader[] quaderList = new Quader[3];
		quaderList[0] = s3;
		quaderList[1] = s4;
		quaderList[2] = s5;
		
		Arrays.sort(quaderList);
		
		for (Skalierbar x : quaderList) {
			System.out.println(x);
		}
	
		
	}
}
