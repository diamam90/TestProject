package lesson12;
import java.util.Locale;	
public class LocaleDemo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA_FRENCH);
		Locale loc = Locale.getDefault();
		System.out.println(loc.getDisplayCountry());
		System.out.println(loc.getLanguage());
		System.out.println(loc.getDisplayLanguage());
		System.out.println(loc.getDisplayName());
	}

}
