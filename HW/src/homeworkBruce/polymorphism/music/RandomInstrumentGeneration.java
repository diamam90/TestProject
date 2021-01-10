package homeworkBruce.polymorphism.music;
import homeworkBruce.polymorphism.music.interfaces.*;
import java.util.*;
public class RandomInstrumentGeneration {
	Random rand = new Random();
	public Playable next() {
		switch(rand.nextInt(6)) {
		default:
		case 0: return new Woodwind();
		case 1: return new Brass();
		case 2: return new Stringed();
		case 3: return new Percussion();
		case 4: return new Wind();
		case 5: return new Guitar();
			}
		}
}
