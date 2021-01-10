package homeworkBruce.polymorphism.music;

import homeworkBruce.polymorphism.music.interfaces.*;

//abstract class Instrument {
//	abstract void  play(Note n);
//	public String toString() {return "Instrument";}
//	abstract void  adjust() ;
	
//}
class Wind implements Instrument, Playable {
	public void play(Note n) {System.out.println("Wind.play " + n);}
	String toSTring() { return "Wind";}
	public void adjust() {System.out.println("Adjusting Wind");}
}
class Percussion implements Instrument, Playable{
	public void play(Note n) {System.out.println("Percussion.play " + n);}
	String toSTring() { return "Percussion";}
	public void adjust() {System.out.println("Adjusting Percussion");}
}
class Stringed implements Instrument, Playable{
	public void play(Note n) {System.out.println("Stringed.play " + n);}
	String toSTring() { return "Stringed";}
	public void adjust() {System.out.println("Adjusting Stringed");}
}
class Brass extends Wind{
	public void play(Note n) {System.out.println("Brass.play " + n);}
	public void adjust() {System.out.println("Adjusting Brass");}
}
class Woodwind extends Wind{
	public void play(Note n) {System.out.println("Woodwind.play " + n);}
	String what() { return "Woodwind";}
}
class Guitar implements Instrument, Playable {
	public void play(Note n) {System.out.println("Guitar.play " + n);}
	String what() { return "Guitar";}
	public void adjust() {System.out.println("Adjusting Guitar");}
}