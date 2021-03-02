package homeworkBruce.containers;
import java.util.*;
public class Gerbil {
	private int gerbilNumber;
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber=gerbilNumber;
	}
	public void hop() {
		System.out.println("Значение gebrilNumber = "+ gerbilNumber);
	}
	public static void main(String[] args) {
		/*ArrayList<Gerbil> gn = new ArrayList<Gerbil>();
		gn.add(new Gerbil(23));
		gn.add(new Gerbil(383));
		gn.add(new Gerbil(32));
		for (int i=0;i<gn.size();i++) {
			gn.get(i).hop();
		}
		*/
		Gerbil g1 = new Gerbil(26);
		Map<String,Gerbil> gerbils = new HashMap<>();
		gerbils.put("Мурка", new Gerbil(1));
		gerbils.put("Жучка", new Gerbil(2));
		gerbils.put("Сучка", g1);
		System.out.println(gerbils.keySet());
		System.out.println(gerbils.containsKey("Жучка"));
		System.out.println(gerbils.get("Сучка"));
	}
	

}
