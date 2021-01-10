package homeworkBruce.polymorphism.music;
import homeworkBruce.polymorphism.music.interfaces.*;
public class Music3 {
	public static void tune(Playable p) {
		p.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Playable[] p) {
		for (Playable i:p) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		RandomInstrumentGeneration gen = new RandomInstrumentGeneration();
		Playable[] orchestra= new Playable[10];
		for (int i=0;i<orchestra.length;i++) {
			orchestra[i]=gen.next();
		}
		tuneAll(orchestra);
		Playable inst = new Guitar();
		tune(inst);

	}
	
		
}


